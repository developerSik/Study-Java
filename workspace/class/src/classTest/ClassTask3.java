package classTest;

public class ClassTask3 {
   public static void main(String[] args) {
      Market market = new Market("�����", 1800, 50);
      Customer[] arCustomer = {
            new Customer("�ѵ���", "01012341234", 10000, 50),
            new Customer("ȫ�浿", "01077777777", 1000, 70)
      };
      
      for (int i = 0; i < arCustomer.length; i++) {
         market.sell(arCustomer[i]);
         System.out.println(arCustomer[i].money);
      }
   }
}