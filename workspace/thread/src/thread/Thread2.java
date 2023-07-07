package thread;

public class Thread2 implements Runnable{
   
   public void run() {
      for (int i = 0; i < 10; i++) {
         System.out.println(Thread.currentThread().getName());
         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      }
   };
}
