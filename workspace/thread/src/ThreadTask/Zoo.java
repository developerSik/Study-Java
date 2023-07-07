package ThreadTask;

public class Zoo {
   public static void main(String[] args) {
      new Animal().makeSound(() -> {
         for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());
            try {Thread.sleep(500);} catch (InterruptedException e) {;}
         }
      });
   }
}