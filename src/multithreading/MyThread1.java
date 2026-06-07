 package multithreading;

 public class MyThread1 extends Thread {

     public void run() {

         for(int i = 1; i <= 5; i++) {

             System.out.println("Thread 2: " + i);
         }
     }
 }
