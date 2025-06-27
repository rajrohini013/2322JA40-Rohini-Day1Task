package day6;


public class ThreadExample extends Thread {
 public void run() {
     for (int i = 1; i <= 10; i++) {
         System.out.println("Number: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted");
         }
     }
 }

 public static void main(String[] args) {
     ThreadExample t = new ThreadExample();
     t.start(); 
 }
}

