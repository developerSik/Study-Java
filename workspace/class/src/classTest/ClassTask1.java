package classTest;

import java.util.Scanner;

class SuperCar {
   String brand;
   String color;
   int price;
   boolean engine;
   String password;
   int errorCount;
   
//   초기화 블록
   {
      this.password = "0000";
   }
   
   public SuperCar() {;}
   
   public SuperCar(String brand, String color, int price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }

//   시동 켜기
//   엔진 상태를 확인하고
//   시동이 꺼져있다면, "시동 켜짐" 출력
//   이미 시동이 켜져있다면, "시동이 이미 켜져있습니다." 출력
//   boolean engineStart(){
//      if(!engine) {
//         engine = true;
//         return true;
//      }
//      return false;
//   }
   
   void engineStart() {
      engine = true;
   }
   
//   시동 끄기
//   엔진 상태를 확인하고
//   시동이 켜져있다면, "시동 꺼짐" 출력
//   이미 시동이 꺼져있다면, "시동이 이미 꺼져있습니다." 출력
   boolean engineStop(){
      if(engine) {
         engine = false;
         return true;
      }
      return false;
   }
   
//   void engineStop() {
//      engine = false;
//   }
   
//   시동을 켜기 위해서 비밀번호 4자리를 입력받아야 한다.
//   3번 연속 잘못 입력했을 시 "경찰 출동" 출력
//   ※ 문자열 비교는 equals()로 비교한다.
//   "ABC".equals("문자열");
   boolean checkPassword(String password) {
      return this.password.equals(password);
   }
}

public class ClassTask1 {
   public static void main(String[] args) {
      SuperCar mom = new SuperCar("페라리", "빨간색", 68_000);
      Scanner sc = new Scanner(System.in);
      
      String menu = "1.시동켜기\n2.시동끄기";
      int choice = 0;
      String password = null;
      boolean check = false;
      
      while(true) {
         System.out.println(menu);
         choice = sc.nextInt();
         
         switch(choice) {
         case 1: // 시동 켜기
            if(!mom.engine) {
               System.out.print("비밀번호: ");
               password = sc.next();
               if(mom.checkPassword(password)) {
                  mom.engineStart();
                  System.out.println("시동 켜짐");
                  mom.errorCount = 0;
                  break;
               }
               mom.errorCount++;
               System.out.println(mom.errorCount + "회 비밀번호 오류");
               if(mom.errorCount == 3) {
                  System.out.println("경찰 출동");
                  check = true;
               }
               break;
            }
            System.out.println("이미 시동이 켜져있습니다.");
            break;
         case 2: // 시동 끄기
            if(mom.engineStop()) {
               System.out.println("시동 꺼짐");
               check = true;
               break;
            }
            System.out.println("이미 시동이 꺼져있습니다.");
            break;
         }
         
         if(check) {
            break;
         }
      }
      
//      while(true) {
//         System.out.println(menu);
//         choice = sc.nextInt();
//         
//         switch(choice) {
//         case 1: // 시동 켜기
//            if(mom.engineStart()) {
//               System.out.println("시동 켜짐");
//               break;
//            }
//            System.out.println("시동이 이미 켜져있습니다.");
//            break;
//         case 2: // 시동 끄기
//            if(mom.engineStop()) {
//               System.out.println("시동 꺼짐");
//               break;
//            }
//            System.out.println("시동이 이미 꺼져있습니다.");
//            break;
//         }
//      }
   }
}
