package ThreadTask;

public class Animal {
   
   public void makeSound(Runnable runnable) {
      String[] sounds = {"¾îÈï", "À½¸Ş", "¾ß¿Ë"};
      Thread[] threads = new Thread[sounds.length];
      
      for (int i = 0; i < threads.length; i++) {
         threads[i] = new Thread(runnable, sounds[i]);
      }
      
      for (int i = 0; i < threads.length; i++) {
         threads[i].start();
         if(i != 0) {
            try {threads[i].join();} catch (InterruptedException e) {;}
         }
      }
      
   }
}
