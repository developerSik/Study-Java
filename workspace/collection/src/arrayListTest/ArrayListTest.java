package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListTest {
   
   public static void main(String[] args) {
//      <?>: 제네릭(이름이 없는)
//      객체화 시 타입을 지정하는 기법
//      설계할 때에는 타입을 지정할 수 없기 때문에 임시로 타입을 선언할 때 사용한다.
//      따로 다운 캐스팅할 필요가 없으며, 지정할 타입에 제한을 줄 수 있기 때문에 Object가 아닌 제네릭으로 선언한다.
      
//      capacity(용량): 미리 확보해 놓을 공간, 나의 메모리의 한계를 확인할 수 있다.
//      용량에 제한을 주는 것이 아니다!
      ArrayList<Integer> datas = new ArrayList<>();
      
      datas.add(40);
      datas.add(50);
      datas.add(90);
      datas.add(70);
      datas.add(10);
      datas.add(80);
      datas.add(20);
      datas.add(30);
      datas.add(100);
      
      System.out.println(datas.size());
      System.out.println(datas);
      
//      정렬
      Collections.sort(datas);
      System.out.println(datas);
      
      
      Collections.reverse(datas);
      System.out.println(datas);
      
      Collections.shuffle(datas);
      System.out.println(datas);
      
//      추가(삽입) 60은 항상 30뒤에 삽입된다. 
//      if(datas.contains(30)) {
//         datas.add(datas.indexOf(30) + 1, 60);
//      }
//      
//      System.out.println(datas);
      
//      수정 10을 1로 수정한다.
//      if(datas.contains(10)) {
//         System.out.println(datas.set(datas.indexOf(10), 1) + "이 1로 수정");
//         System.out.println(datas);
//      }
      
//      삭제(값으로 삭제) 20을 삭제한다.
//      if(datas.remove(Integer.valueOf(20))) {
//         System.out.println("삭제 성공");
//         System.out.println(datas);
//      }
      
//      삭제(인덱스로 삭제) 50을 삭제한다.
//      if(datas.contains(50)) {
//         System.out.println(datas.remove(datas.indexOf(50)) + "삭제");
//         System.out.println(datas);
//      }
      
   }
}

