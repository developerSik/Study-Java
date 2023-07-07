package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
   
   public static int changeToInteger(int c) {
      return c - 48;
   }
   
   public static void main(String[] args) {
//      10~1���� ArrayList�� ��� ���
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.range(0, 10).map(data -> 10 - data).forEach(datas::add);
//      System.out.println(datas);
      
//      1~10���� ArrayList�� ��� ���
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 10).forEach(datas::add);
//      System.out.println(datas);
      
//      ABCDEF�� �� ���ں��� ���
//      String data = "ABCDEF";
//      data.chars().forEach(c -> System.out.println((char)c));
      
//      1~100���� �� Ȧ���� ArrayList�� ��� ���
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 1).forEach(datas::add);
//      System.out.println(datas);
      
//      A~F���� �� D�����ϰ� ArrayList�� ��� ���
//      ArrayList<Character> datas = new ArrayList<Character>();
//      IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(data -> datas.add((char)data));
//      System.out.println(datas);
      
//      5���� ���ڿ��� ��� �ҹ��ڷ� ����("Black", "WHITE", "reD", "yeLLow", "PINk"), toLowerCase() ���
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Black", "WHITE", "reD", "yeLLow", "PINk"));
//      datas.stream().map(String::toLowerCase).forEach(System.out::println);
      
//      1~100���� �� ¦���� ArrayList�� ��� ���
//      ArrayList<Integer> datas = new ArrayList<Integer>();
//      IntStream.rangeClosed(1, 100).filter(data -> data % 2 == 0).forEach(datas::add);
//      System.out.println(datas);
      
//      "Apple", "banana", "Melon" �� ù ��° ���ڰ� �빮���� ���ڿ� ���
//      ArrayList<String> datas = new ArrayList<String>(Arrays.asList("Apple", "banana", "Melon"));
//      datas.stream().filter(data -> data.charAt(0) >= 'A')
//                  .filter(data -> data.charAt(0) <= 'Z')
//                     .forEach(System.out::println);
      
//      �ѱ��� ������ ����
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String input = "�ϰ��̻�";
//      input.chars().map(hangle::indexOf).forEach(System.out::print);
      
      
//      ������ �ѱ۷� ���� "1024" -> '1' - 48 = 1
//      String hangle = "�����̻�����ĥ�ȱ�";
//      String input = "1024";
//      input.chars().map(StreamTask::changeToInteger).forEach(i -> System.out.print(hangle.charAt(i)));
   }
}
