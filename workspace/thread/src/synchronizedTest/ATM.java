package synchronizedTest;

public class ATM implements Runnable{
   
   private int money;
   
   public ATM() {
      this.money = 10000;
   }
   
   @Override
   public void run() {
      for (int i = 0; i < 5; i++) {
         withdraw();
         try {Thread.sleep(1000);} catch (InterruptedException e) {;}
      }
   }
   
//   �ڿ��� ���� ���� �߻� �� ����ȭ�� ����Ͽ�, ��Ƽ ȯ�濡�� Ư�� �κ��� ���� ȯ������ �ٲ���� �Ѵ�.
   public synchronized void withdraw() {
//      synchronized (this) { // �ڿ��� ������ ��ü(�ڿ��� ����) : mutex
         this.money -= 1000;
         System.out.println(Thread.currentThread().getName() + "��(��) 1000�� ���");
         System.out.println("���� �ܾ�: " + this.money + "��");
//      }
   }
}
