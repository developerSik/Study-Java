package inputTest;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String First = null;
		 String Second = null;
		 int Hap = 0;
		 
		 System.out.print("ù��° �� : ");
		 First = sc.next();
		 System.out.print("�ι�° �� : ");
		 Second = sc.next();
		 Hap = Integer.parseInt(First) * Integer.parseInt(Second);
		 System.out.print("�� ���� ���� : ");
		 System.out.println(Hap);
		 

		 
	}
}
//package inputTest;
//
//import java.util.Scanner;
//
//public class InputTask {
//   public static void main(String[] args) {
////      �� ������ �Է��� �� ���� ��� ���
////      ��, next()�� ����Ѵ�.
//      Scanner sc = new Scanner(System.in);
//      String message = "�� ������ �Է��ϼ���.", example = "��)1 3", format = "%d * %d = %d";
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