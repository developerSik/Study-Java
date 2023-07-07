package arrayListTask.food;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Restaurent {
   ArrayList<Food> foods = DBConnecter.foods;
   
//   - 음식 추가
   public void insert(Food food) {
      foods.add(food);
   }
   
//   - 음식 이름으로 음식 종류 조회
   public String findKindByName(String name) {
      for (Food food : foods) {
         if(food.getName().equals(name)) {
            return food.getKind();
         }
      }
      return null;
   }
   
//   - 사용자가 원하는 종류의 음식 전체 조회
   public ArrayList<Food> findByKind(String kind) {
      ArrayList<Food> arFood = new ArrayList<Food>();
      
      for (Food food : foods) {
         if(food.getKind().equals(kind)) {
            arFood.add(food);
         }
      }
      
      return arFood;
   }
   
//   - 음식 종류 수정 후 가격 10% 상승
//   매개변수로 받는 건 이미 수정이 다 끝난 정보다.
   public void update(Food food) {
      for (Food foodInDB : foods) {
         if(foodInDB.getName().equals(food.getName())) {
            foodInDB.setKind(food.getKind());
            foodInDB.setPrice(food.getPrice()); // 화면에서 애초에 10% 가격 상승
//            foodInDB.setPrice((int)(food.getPrice() * 1.1));
         }
      }
   }
   
   public Food select(String name) {
      for (Food food : foods) {
         if(food.getName().equals(name)) {
            return food;
         }
      }
      return null;
   }
   
//   - 사용자가 원하는 종류의 음식 개수 조회
   public int getCountByKind(String kind) {
      int count = 0;
      for (Food food : foods) {
         if(food.getKind().equals(kind)) {
            count++;
         }
      }
      return count;
   }
}
