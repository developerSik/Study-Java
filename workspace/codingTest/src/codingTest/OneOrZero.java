package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class OneOrZero {
   public int solution(String s) {
      int result = 0;
      ArrayList<String> datas = new ArrayList<String>(Arrays.asList(s.split("0")));
      List<Integer> lengths = datas.stream().map(String::length).collect(Collectors.toList())
         .stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
      
      result = lengths.size() == 0 ? 0 : lengths.get(0);
      
      return result;
   }
   
   public static void main(String[] args) {
      int result = new OneOrZero().solution("00000");
      System.out.println(result);
   }
}
