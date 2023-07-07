package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
   ArrayList<Fruit> fruits = DBConnecter.furits;
   
//   - ���� �˻�
   public Fruit checkFruit(String name) {
      for (Fruit fruit : fruits) {
         if(fruit.getName().equals(name)) {
            return fruit;
         }
      }
      return null;
   }
   
//   - ���� �߰�
   public void add(Fruit fruit) {
      fruits.add(fruit);
   }
   
//   - ���� ����
   public void remove(String name) {
      Fruit fruit = checkFruit(name);
      fruits.remove(fruit);
   }
//   - ���� ������ ��� ���ݺ��� ���� �� �˻�
//   1. ȭ�鿡�� ���� �Է�
   public boolean checkPrice(int price) {
      return getAverage() > price;
   }
   
//   2. DB���� ��ü ��ȸ
   public ArrayList<Fruit> findByPriceLessThanAverage() {
      ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
      
      for (Fruit fruit : fruits) {
         if(fruit.getPrice() < getAverage()) {
            arFruit.add(fruit);
         }
      }
      
      return arFruit;
   }
   
   public double getAverage() {
      int total = 0;
      
      for (Fruit fruit : fruits) {
         total += fruit.getPrice();
      }
      
      return (double)total / fruits.size();
   }
   
//   - ���� ��ü ��ȸ
   public ArrayList<Fruit> findAll() {
      ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
      
      for (Fruit fruit : fruits) {
         arFruit.add(fruit);
      }
      
      return arFruit;
   }
   
//   - ���� �̸����� ���� ��ȸ
   public int findByName(String name) {
      return checkFruit(name).getPrice();
   }
}
