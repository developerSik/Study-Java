package thread;

public class Thread3 implements Runnable{
   private boolean exit;
   
   public boolean isExit() {
      return exit;
   }


   public void setExit(boolean exit) {
      this.exit = exit;
   }

   @Override
   public void run() {
      while(true) {
         System.out.println("�۾���..");
//         try {wait();} catch (InterruptedException e) {;}
//         if(exit) {break;}
//         if(Thread.currentThread().isInterrupted()){ //�����带 ���ߴ� �ڵ尡 ���� ���
//            break;
//         }
//         try {
//            Thread.sleep(1000);
//         } catch (InterruptedException e) { //�����带 ���ߴ� �ڵ尡 ���� ���
//            System.out.println("���� �߻���");
//            break;
//         }
      }
   }
}