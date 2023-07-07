package controllStatement;

import java.util.Scanner;

public class WhileTask {
   public static void main(String[] args) {
      String title = "Q. 당신이 좋아하는 색을 선택하세요.";
      String menu = "1.빨간색\n2.노란색\n3.검은색\n4.흰색\n5.나가기";
      int choice = 0;
      Scanner scan = new Scanner(System.in);
      
      String redMessage = "불같고 열정적이고 적극적이다.";
      String yellowMessage = "발랄하고 밝고 귀엽고 개성있고 착하다.";
      String blackMessage = "묵묵하고 든든하고 냉철하고 멋지다.";
      String whiteMessage = "천사같고 깔끔하고 정리를 좋아하고 배려심이 많다.";
      String errorMessage = "다시 시도해주세요.";
      String goodByeMessage = "종료합니다.";
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

	