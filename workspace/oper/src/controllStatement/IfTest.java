package controllStatement;

import java.util.Scanner;

public class IfTest {
   public static void main(String[] args) {
//      �� ���� ��Һ�
      Scanner sc = new Scanner(System.in);
      int firstNumber = 0, lastNumber = 0;
      String message = "���� �� ���� �Է��ϼ���", result = null;
      
      System.out.println(message);
      firstNumber = sc.nextInt();
      lastNumber = sc.nextInt();
      
      if(firstNumber > lastNumber) {
         result = "ū ��: " + firstNumber;
         
      }else if(firstNumber != lastNumber) {
         result = "ū ��: " + lastNumber;
         
      }else {
         result = "�� ���� �����ϴ�.";
         
      }
      
      System.out.println(result);
      
   }
}
