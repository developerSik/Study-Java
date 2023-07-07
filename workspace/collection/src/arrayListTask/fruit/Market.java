package arrayListTask.fruit;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Market {
   ArrayList<Fruit> fruits = DBConnecter.furits;
   
//   - 과일 검사
   public Fruit checkFruit(String name) {
      for (Fruit fruit : fruits) {
         if(fruit.getName().equals(name)) {
            return fruit;
         }
      }
      return null;
   }
   
//   - 과일 추가
   public void add(Fruit fruit) {
      fruits.add(fruit);
   }
   
//   - 과일 삭제
   public void remove(String name) {
      Fruit fruit = checkFruit(name);
      fruits.remove(fruit);
   }
//   - 과일 가격이 평균 가격보다 낮은 지 검사
//   1. 화면에서 가격 입력
   public boolean checkPrice(int price) {
      return getAverage() > price;
   }
   
//   2. DB에서 전체 조회
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
   
//   - 과일 전체 조회
   public ArrayList<Fruit> findAll() {
      ArrayList<Fruit> arFruit = new ArrayList<Fruit>();
      
      for (Fruit fruit : fruits) {
         arFruit.add(fruit);
      }
      
      return arFruit;
   }
   
//   - 과일 이름으로 가격 조회
   public int findByName(String name) {
      return checkFruit(name).getPrice();
   }
}
