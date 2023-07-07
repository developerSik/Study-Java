package operTest;

import java.util.Scanner;

public class Oper3 {
   public static void main(String[] args) {
//      사용자에게 키를 입력받고 
//      정수라면 정수로 출력
//      실수라면 실수로 출력
//      예)   183 -> 183 출력
//            183.5 -> 183.5 출력
//         183.0 -> 183 출력
      
      double height = 0.0;
      String message = "키: ", format = null;
      Scanner sc = new Scanner(System.in);
      boolean isInteger = false;
      int length = 0;
      
      System.out.print(message);
      height = sc.nextDouble();
      
      length = (height - (int)height + "").length() - 2;
      isInteger = height - (int)height == 0;
      format = isInteger ? "%.0f" : "%." + length + "f";
      
      System.out.printf(format, height);
   }
}

