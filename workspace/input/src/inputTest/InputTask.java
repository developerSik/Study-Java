package inputTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String First = null;
		 String Second = null;
		 int Hap = 0;
		 
		 System.out.print("첫번째 값 : ");
		 First = sc.next();
		 System.out.print("두번째 값 : ");
		 Second = sc.next();
		 Hap = Integer.parseInt(First) * Integer.parseInt(Second);
		 System.out.print("두 값의 곱은 : ");
		 System.out.println(Hap);
		 

		 
	}
}
//package inputTest;
//
//import java.util.Scanner;
//
//public class InputTask {
//   public static void main(String[] args) {
////      두 정수를 입력한 뒤 곱셈 결과 출력
////      단, next()만 사용한다.
//      Scanner sc = new Scanner(System.in);
//      String message = "두 정수를 입력하세요.", example = "예)1 3", format = "%d * %d = %d";
//      String data1 = null, data2 = null;
//      int number1 = 0, number2 = 0, result = 0;
//      
//      System.out.println(message);
//      System.out.println(example);
//      data1 = sc.next();
//      data2 = sc.next();
//      
//      number1 = Integer.parseInt(data1);
//      number2 = Integer.parseInt(data2);
//      
//      result = number1 * number2;
//      
//      System.out.printf(format, number1, number2, result);
//   }
//}
