package controllStatement;

import java.util.Scanner;

public class SwitchTest {
   public static void main(String[] args) {
      String title = "Q. ����� �����ϴ� ���� �����ϼ���.";
      String menu = "1.������\n2.�����\n3.������\n4.���";
      int choice = 0;
      Scanner scan = new Scanner(System.in);
      
      String redMessage = "�Ұ��� �������̰� �������̴�.";
      String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
      String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������.";
      String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
      String errorMessage = "�ٽ� �õ����ּ���.";
      String result = null;
      
      System.out.println(title);
      System.out.println(menu);
      
      choice = scan.nextInt();
      
      switch(choice) {
      case 1:
    	  result = redMessage;

   
   }
      
   }
}
