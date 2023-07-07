package arrayTest;

import java.util.Scanner;

public class ArrayTask {
   public static void main(String[] args) {
//      각 버튼을 눌렀을 때, 이동하는 페이지는 다음과 같다.
      
//      btn1 : 회원가입 페이지
//      btn2 : 로그인 페이지
//      btn3 : 마이 페이지
//      btn4 : 로그아웃
      
//      회원가입 -> 로그인 -> 마이 페이지
//      위 순서대로 입력해야 하며, 만약 이전 단계를 진행하기 전에 다음 단계 버튼을 누를 경우, 이전 단계에 대한 메세지를 출력해준다.
//      예) 로그인 클릭 시, "회원가입을 먼저 진행해주세요" 출력
//          회원가입에 성공했어도, 로그인을 안하고 마이페이지를 선택하면 메세지는 이전 단계에 대한 메세지가 출력되지만
//         다시 회원가입부터 진행해야 한다.
      
//      알맞은 단계의 버튼을 누르면, 해당 단계에 대한 메세지를 출력해준다.
//      예)   회원가입 클릭 시, 회원가입 성공
//         로그인 클릭 시, 로그인 성공
//         마이 페이지 클릭 시, 본인 이름과 나이 출력
//         로그아웃 클릭 시, 로그아웃 성공
      
      String[] arButton = {"btn1", "btn2", "btn3", "btn4"};
      String[] arMessage = {"회원가입 성공", "로그인 성공", "한동석(20)", "로그아웃 성공"};
      String[] arError = {"회원가입을 먼저 진행해주세요", "로그인을 먼저 진행해주세요"};
      String errorMessage = "다시 시도해주세요";
      
      Scanner sc = new Scanner(System.in);
      int choice = 0, previous = 0;
      
      while(true) {
         for (int i = 0; i < arButton.length; i++) {
            System.out.println(i + 1 + ". " + arButton[i]);
         }
         
         previous = previous == 0? 0 : choice;
         choice = sc.nextInt();
         if(choice < 1 || choice > 4) {System.out.println(errorMessage); continue;}
         if(choice == 4) {break;}
         
         if(choice - 1 != previous  ) {
            previous = 0;
            System.out.println(arError[choice - 2]);
            continue;
         }
         System.out.println(arMessage[choice - 1]);
         previous = choice;
      }
   }
}

