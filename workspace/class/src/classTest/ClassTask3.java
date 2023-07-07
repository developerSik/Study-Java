package classTest;

public class ClassTask3 {
   public static void main(String[] args) {
      Market market = new Market("»õ¿ì±ø", 1800, 50);
      Customer[] arCustomer = {
            new Customer("ÇÑµ¿¼®", "01012341234", 10000, 50),
            new Customer("È«±æµ¿", "01077777777", 1000, 70)
      };
      
      for (int i = 0; i < arCustomer.length; i++) {
         market.sell(arCustomer[i]);
         System.out.println(arCustomer[i].money);
      }
   }
}