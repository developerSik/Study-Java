package arrayListTask.food;

import java.util.ArrayList;

import arrayListTask.DBConnecter;

public class Restaurent {
   ArrayList<Food> foods = DBConnecter.foods;
   
//   - ���� �߰�
   public void insert(Food food) {
      foods.add(food);
   }
   
//   - ���� �̸����� ���� ���� ��ȸ
   public String findKindByName(String name) {
      for (Food food : foods) {
         if(food.getName().equals(name)) {
            return food.getKind();
         }
      }
      return null;
   }
   
//   - ����ڰ� ���ϴ� ������ ���� ��ü ��ȸ
   public ArrayList<Food> findByKind(String kind) {
      ArrayList<Food> arFood = new ArrayList<Food>();
      
      for (Food food : foods) {
         if(food.getKind().equals(kind)) {
            arFood.add(food);
         }
      }
      
      return arFood;
   }
   
//   - ���� ���� ���� �� ���� 10% ���
//   �Ű������� �޴� �� �̹� ������ �� ���� ������.
   public void update(Food food) {
      for (Food foodInDB : foods) {
         if(foodInDB.getName().equals(food.getName())) {
            foodInDB.setKind(food.getKind());
            foodInDB.setPrice(food.getPrice()); // ȭ�鿡�� ���ʿ� 10% ���� ���
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
   
//   - ����ڰ� ���ϴ� ������ ���� ���� ��ȸ
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
