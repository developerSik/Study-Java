package synchronizedTest;

public class CU {
   public static void main(String[] args) {
      ATM atm = new ATM();
      
      Thread mom = new Thread(atm, "����");
      Thread son = new Thread(atm, "�Ƶ�");
      
      mom.start();
      son.start();
   }
}