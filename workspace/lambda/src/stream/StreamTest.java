package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
   public Integer getTwoTimes(Integer number) {
      return number * 2;
   }
   
   public boolean checkEven(int number) {
      return number % 2 == 0;
   }
   
   public int change(int number) {
      return 10 - number;
   }
   
   public static void main(String[] args) {
//      Arrays.asList()
//      배열을 List로 변경가능
//      Integer[] arData = {10, 20, 30, 40, 50};
//      여러 개의 값을 List로 변경가능
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(arData));
//      System.out.println(datas.toArray()[0]);
//      System.out.println(datas);
      
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//      StreamTest streamTest = new StreamTest();
      
//      forEach() : 반복
//      여러 값을 가지고 있는 컬렉션 객체에서 forEach 메소드를 사용할 수 있다.
//      forEach() 메소드에는 Consumer 인터페이스 타입의 값을 전달해야 한다.
//      Consumer는 함수형 인터페이스이기 때문에 람다식을 사용할 수 있다.
//      매개변수에는 컬렉션 객체 안에 있는 값들이 순서대로 담기고,
//      화살표 뒤에서는 실행하고 싶은 문장을 작성한다.
//      datas.stream().forEach(data -> System.out.println(data));
//      datas.forEach(data -> System.out.println(data));
//      datas.forEach(System.out::println);
      
//      map() : 기존 값 변경
//      ArrayList<User> users = new ArrayList<User>(Arrays.asList(new User("한동석", 20), new User("홍길동", 19)));
//      datas.stream().map(data -> data * 2).forEach(System.out::println);
//      datas.stream().map(streamTest::getTwoTimes).forEach(System.out::println);
//      users.stream().map(User::getAge).forEach(System.out::println);
      
//      range(inclusive, exclusive)
//      rangeClosed(inclusive, inclusive)
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(System.out::println);
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);
      
//      chars(): 문자열을 IntStream으로 변경
//      String data = "ABC";
//      data.chars().forEach(System.out::println);
//      data.chars().map(c -> (char)c).forEach(System.out::println);
//      data.chars().forEach(c -> System.out.println((char)c));
      
//      filter(): 조건식이 true일 경우만 추출
//      StreamTest streamTest = new StreamTest();
//      IntStream.range(0, 10).filter(data -> data % 2 == 0).forEach(System.out::println);
//      IntStream.range(0, 10).filter(streamTest::checkEven).forEach(System.out::println);
      
//      sorted(): 정렬
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      StreamTest streamTest = new StreamTest();
//      IntStream.rangeClosed(0, 9).map(streamTest::change).forEach(datas::add);
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);
//      datas.stream().sorted().forEach(System.out::println);
//      datas.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
      
//      collect(): 결과를 다양한 타입으로 리턴해준다.
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(10, 30, 15));
//      System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(":")));
      
//      ArrayList<Integer> datas = new ArrayList<Integer>(Arrays.asList(30, 20, 90, 40, 80));
//      컬렉션에서는 stream에 있는 sorted를 사용하지 않고 sort를 사용하여 직접 접근한 주소를 정렬시킨다.
//      datas.sort(null);
//      datas.sort(Collections.reverseOrder());
//      System.out.println(datas);
//      List<Integer> results = datas.stream().sorted().collect(Collectors.toList());
//      System.out.println(results);
      
//      System.out.println(datas.stream().map(String::valueOf).collect(Collectors.joining(",")));
   }
}

