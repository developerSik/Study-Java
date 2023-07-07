package arrayListTask.love;

import java.util.ArrayList;
import java.util.Collections;

import arrayListTask.DBConnecter;

public class Loveapp {
   ArrayList<Love> loves = DBConnecter.loves;
   
//   - �̻��� �߰�
   public void insert(Love love) {
      loves.add(love);
   }
   
//   - ����ڰ� ���ϴ� ������ �̻��� ��� ��ȸ
   public ArrayList<Love> findByAge(int age){
      ArrayList<Love> loves = new ArrayList<Love>();
      
      for (Love love : loves) {
         if(love.getAge() == age) {
            loves.add(love);
         }
      }
      return loves;
   }
//   - �̻����� ���� ����
   public void update(Love love) {
      for (Love loveInDB : loves) {
         if(loveInDB.getNumber() == love.getNumber()) {
            loveInDB.setAge(love.getAge());
            break;
         }
      }
   }
   
//   - �̻��� ���� �� ����
   public ArrayList<Love> sortByAge() {
//      ���� �����ڷ� ���� �ּҸ� ������ mutable�̱� ������,
//      �ٸ� ������ ������ ��� ������ �� �ִ�.
//      ������ �̷� ������� ���踦 �ϸ�, ��𿡼� ������ �����ߴ� �� �� �� ����.
      
//      ���� ���縦 ����ϸ� ���� ���� �ϳ��� �����ؼ� ���� ������,
//      �ٸ� ������ �ʵ带 �����ص� ������ �ٲ��� �ʴ´�.
//      ������, ���� ���� �ʵ忡 ��ü�� ����Ǿ� �ִٸ� ���� ���縦 ���� �ش� ��ü�� �ּҰ��� �״�� ������ �ȴ�.
//      ����, ���� �ʵ忡 ����� ��ü�� ����ȴٸ�, ���� ����� ��ü�鵵 �ش� ������ ����ȴ�.
      
//      �ʵ� �ȿ� �� �ٸ� ��ü�� ����Ǿ� ������(���� "��ü �׷���") ���� ���簡 �ʿ��ϴ�.
//      ���� �ּҸ� �״�� �޴� ���� �ƴ϶� ��ü �׷��� ��ŭ new�� ����Ͽ� ���� ���縦 �����ؾ� �Ѵ�.
//      �̷��� ��ü �׷����� ��쿡�� ���� ���縦 ������� �ʰ� ���� ���縦 ���� immutable�� ������ �޼��ؾ� �Ѵ�.
      
      ArrayList<Love> copyLoves = (ArrayList<Love>)loves.clone(); // ���� ����
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Love> result = new ArrayList<Love>();
      
      for (Love love : loves) {
         ages.add(love.getAge());
      }
      
      Collections.sort(ages);
      Collections.reverse(ages);
      
      for (Integer age : ages) {
         for (Love love : copyLoves) {
            if(love.getAge() == age) {
               result.add(love);
               copyLoves.remove(love);
               break;
            }
         }
      }
      return result;
   }
}

