package classTest;

import java.util.Scanner;

class SuperCar {
   String brand;
   String color;
   int price;
   boolean engine;
   String password;
   int errorCount;
   
//   �ʱ�ȭ ���
   {
      this.password = "0000";
   }
   
   public SuperCar() {;}
   
   public SuperCar(String brand, String color, int price) {
      this.brand = brand;
      this.color = color;
      this.price = price;
   }

//   �õ� �ѱ�
//   ���� ���¸� Ȯ���ϰ�
//   �õ��� �����ִٸ�, "�õ� ����" ���
//   �̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
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
   
//   �õ� ����
//   ���� ���¸� Ȯ���ϰ�
//   �õ��� �����ִٸ�, "�õ� ����" ���
//   �̹� �õ��� �����ִٸ�, "�õ��� �̹� �����ֽ��ϴ�." ���
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
   
//   �õ��� �ѱ� ���ؼ� ��й�ȣ 4�ڸ��� �Է¹޾ƾ� �Ѵ�.
//   3�� ���� �߸� �Է����� �� "���� �⵿" ���
//   �� ���ڿ� �񱳴� equals()�� ���Ѵ�.
//   "ABC".equals("���ڿ�");
   boolean checkPassword(String password) {
      return this.password.equals(password);
   }
}

public class ClassTask1 {
   public static void main(String[] args) {
      SuperCar mom = new SuperCar("���", "������", 68_000);
      Scanner sc = new Scanner(System.in);
      
      String menu = "1.�õ��ѱ�\n2.�õ�����";
      int choice = 0;
      String password = null;
      boolean check = false;
      
      while(true) {
         System.out.println(menu);
         choice = sc.nextInt();
         
         switch(choice) {
         case 1: // �õ� �ѱ�
            if(!mom.engine) {
               System.out.print("��й�ȣ: ");
               password = sc.next();
               if(mom.checkPassword(password)) {
                  mom.engineStart();
                  System.out.println("�õ� ����");
                  mom.errorCount = 0;
                  break;
               }
               mom.errorCount++;
               System.out.println(mom.errorCount + "ȸ ��й�ȣ ����");
               if(mom.errorCount == 3) {
                  System.out.println("���� �⵿");
                  check = true;
               }
               break;
            }
            System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
            break;
         case 2: // �õ� ����
            if(mom.engineStop()) {
               System.out.println("�õ� ����");
               check = true;
               break;
            }
            System.out.println("�̹� �õ��� �����ֽ��ϴ�.");
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
//         case 1: // �õ� �ѱ�
//            if(mom.engineStart()) {
//               System.out.println("�õ� ����");
//               break;
//            }
//            System.out.println("�õ��� �̹� �����ֽ��ϴ�.");
//            break;
//         case 2: // �õ� ����
//            if(mom.engineStop()) {
//               System.out.println("�õ� ����");
//               break;
//            }
//            System.out.println("�õ��� �̹� �����ֽ��ϴ�.");
//            break;
//         }
//      }
   }
}
