package arrayTest;

import java.util.Scanner;

public class ArrayTask {
   public static void main(String[] args) {
//      �� ��ư�� ������ ��, �̵��ϴ� �������� ������ ����.
      
//      btn1 : ȸ������ ������
//      btn2 : �α��� ������
//      btn3 : ���� ������
//      btn4 : �α׾ƿ�
      
//      ȸ������ -> �α��� -> ���� ������
//      �� ������� �Է��ؾ� �ϸ�, ���� ���� �ܰ踦 �����ϱ� ���� ���� �ܰ� ��ư�� ���� ���, ���� �ܰ迡 ���� �޼����� ������ش�.
//      ��) �α��� Ŭ�� ��, "ȸ�������� ���� �������ּ���" ���
//          ȸ�����Կ� �����߾, �α����� ���ϰ� ������������ �����ϸ� �޼����� ���� �ܰ迡 ���� �޼����� ��µ�����
//         �ٽ� ȸ�����Ժ��� �����ؾ� �Ѵ�.
      
//      �˸��� �ܰ��� ��ư�� ������, �ش� �ܰ迡 ���� �޼����� ������ش�.
//      ��)   ȸ������ Ŭ�� ��, ȸ������ ����
//         �α��� Ŭ�� ��, �α��� ����
//         ���� ������ Ŭ�� ��, ���� �̸��� ���� ���
//         �α׾ƿ� Ŭ�� ��, �α׾ƿ� ����
      
      String[] arButton = {"btn1", "btn2", "btn3", "btn4"};
      String[] arMessage = {"ȸ������ ����", "�α��� ����", "�ѵ���(20)", "�α׾ƿ� ����"};
      String[] arError = {"ȸ�������� ���� �������ּ���", "�α����� ���� �������ּ���"};
      String errorMessage = "�ٽ� �õ����ּ���";
      
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

