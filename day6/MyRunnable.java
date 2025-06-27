package day6;


class MyRunnable implements Runnable {
 public void run() {
     System.out.println("Message from: " + Thread.currentThread().getName());
 }

 public static void main(String[] args) {
     
     MyRunnable myRunnable = new MyRunnable();

    
     Thread t1 = new Thread(myRunnable, "Thread-1");
     Thread t2 = new Thread(myRunnable, "Thread-2");

    
     t1.start();
     t2.start();
 }
}
