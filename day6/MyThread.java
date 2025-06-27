package day6;

class MyThread extends Thread {
    public void run() {
        try {
            System.out.println(getName() + " is running");
            Thread.sleep(1000); 
            System.out.println(getName() + " finished");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();

        try {
            t1.join(); 
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        t2.start(); 
    }
}
