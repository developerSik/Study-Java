package controllStatement;

import java.util.Scanner;

public class WhileTask {
   public static void main(String[] args) {
      String title = "Q. ����� �����ϴ� ���� �����ϼ���.";
      String menu = "1.������\n2.�����\n3.������\n4.���\n5.������";
      int choice = 0;
      Scanner scan = new Scanner(System.in);
      
      String redMessage = "�Ұ��� �������̰� �������̴�.";
      String yellowMessage = "�߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.";
      String blackMessage = "�����ϰ� ����ϰ� ��ö�ϰ� ������.";
      String whiteMessage = "õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.";
      String errorMessage = "�ٽ� �õ����ּ���.";
      String goodByeMessage = "�����մϴ�.";
      String result = null;
      boolean flag = false;
      
//      while(choice != 5) {
      while(true) {
         System.out.println(title);
         System.out.println(menu);
         
         choice = scan.nextInt();
//         if(choice == 5) {break;}
         
         switch(choice) {
         case 1:
            result = redMessage;
            break;
         case 2:
            result = yellowMessage;
            break;
         case 3:
            result = blackMessage;
            break;
         case 4:
            result = whiteMessage;
            break;
         case 5:
            result = goodByeMessage;
            flag = true;
            break;
         default:
            result = errorMessage;
            break;
         }
         
         System.out.println(result);
         
         if(flag) {break;}
         
      }
   }
}

	