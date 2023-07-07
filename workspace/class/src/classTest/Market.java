package classTest;

public class Market {
   String name;
   int price;
   int stock;
   
   public Market() {;}
   
   public Market(String name, int price, int stock) {
      this.name = name;
      this.price = price;
      this.stock = stock;
   }

   void sell(Customer customer) {
      customer.money -= price * ((100 - customer.discount) * 0.01);
      stock--;
   }
}