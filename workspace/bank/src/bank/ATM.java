package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
      String[] bankNames = {"��������", "��������", "īī����ũ"};
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[3];
      final int ACCOUNT_LENGTH = 6;
      
      String message = "1. ��������\n2. ��������\n3. īī����ũ\n4. ������";
      String menu = "1. ���°���\n2. �Ա��ϱ�\n3. ����ϱ�\n4. �ܾ���ȸ\n5. ���¹�ȣ ã��\n6. ���� ���� �޴��� ���ư���";
      Scanner sc = new Scanner(System.in);
      Random random = new Random();
      String account = "", password = null, phoneNumber = null;
      Bank user = null;
      int money = 0;
      
      int i = 0, choice = 0;
      
      
      while(true) { 
    	 account = "";
         System.out.println(message);
         i = sc.nextInt();
         
         if(i == 4) {break;}
         
         i--;
         
         while(true) {
            Bank[] banks = {new Shinhan(), new Kookmin(), new Kakao()};
            
            System.out.println(menu);
            choice = sc.nextInt();
            
            if(choice == 6) {break;}
            
            switch(choice) {
            case 1: // ���°���
               if(arCount[i] == 100) {System.out.println("�� �̻� ���¸� ������ �� ���� �����Դϴ�."); break;}
               
               user = banks[i];
               
               
               while(true) {
   //               ���¹�ȣ�� 0���� ���� ����
   //               for (int j = 0; j < ACCOUNT_LENGTH; j++) {
   //                  account += random.nextInt(10);
   //               }
                  
   //               ���¹�ȣ�� 1���� ���� ����
   //               100000 ~ 999999 -> 0 ~ 899999
                  account += random.nextInt(900000) + 100000;
                  account = i + 1 + account;
                  
                  if(Bank.checkAccount(arrBank, arCount, account) == null) {
                     break;
                  }
               }
               
               user.setAccount(account);
               
               System.out.print("������: ");
               user.setName(sc.next());
               
               while(true) {
                  System.out.print("��й�ȣ[4�ڸ�]: ");
                  password = sc.next();
                  
                  if(password.length() == 4) {break;}
               }
               
               user.setPassword(password);
               
               while(true) {
                  System.out.print("�ڵ��� ��ȣ['-' ����]");
                  phoneNumber = sc.next();
                  phoneNumber = phoneNumber.replaceAll("-", "");
                  if(phoneNumber.length() == 11 && Bank.checkPhoneNumber(arrBank, arCount, phoneNumber) == null) {break;}
               }
               
               user.setPhoneNumber(phoneNumber);
               
               arrBank[i][arCount[i]] = user;
               arCount[i]++;
               
               System.out.println(bankNames[i] + ", ȯ���Ѵ�.");
               System.out.println("���� ���¹�ȣ: "+ account);
               
               break;
            case 2: // �Ա��ϱ�
               System.out.print("���¹�ȣ: ");
               account = sc.next();
               
               System.out.print("��й�ȣ: ");
               password = sc.next();
               
               // ����ҿ� ����, �Է¹��� ���¹�ȣ�� ��й�ȣ�� �����ϸ�
               // �α��� �˻縦 ���� �α��� ���� �� ȸ�� ��ü�� �������ش�.
               user = Bank.login(arrBank, arCount, account, password);
               if(user != null) {
                  if(user.getAccount().charAt(0) - 48 == i + 1) {
                     System.out.print("�Աݾ�: ");
                     money = sc.nextInt();
                     if(money <= 0) {
                        System.out.println("�ٽ� �Է����ּ���.");
                        break;
                     }
                     
                     user.deposit(money);
                  }else {
                     System.out.println("������ ���࿡���� �Ա��� �����մϴ�.");
                  }
                  
                  
//                  boolean flag = false;
////                  ���� ������ ���� ��������, ���� ������ ������ ���� ��������
//                  if(user instanceof Shinhan) {
//                     if(i == 0) {
//                        flag = true;
//                     }
//                  }else if(user instanceof Kookmin) {
//                     if(i == 1) {
//                        flag = true;
//                     }
//                  }else {
//                     if(i == 2) {
//                        flag = true;
//                     }
//                  }
//                  if(flag) {
//                     System.out.print("�Աݾ�: ");
//                     money = sc.nextInt();
//                     if(money <= 0) {
//                        System.out.println("�ٽ� �Է����ּ���.");
//                        break;
//                     }
//                     
//                     user.deposit(��);
//                  }else {
//                     System.out.println("������ ���࿡���� �Ա��� �����մϴ�.");
//                  }
               }
               
               break;
            case 3: // ����ϱ�
               System.out.print("���¹�ȣ: ");
               account = sc.next();
               
               System.out.print("��й�ȣ: ");
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               
               if(user != null) {
                  System.out.print("��ݾ�: ");
                  money = sc.nextInt();
                  if(user.getMoney() < (user instanceof Kookmin ? money * 1.5 : money)) {
                     System.out.println("�ܾ� ����");
                     break;
                  }
                  user.withdraw(money);
               }
               break;
            case 4: // �ܾ���ȸ
               System.out.print("���¹�ȣ: ");
               account = sc.next();
               
               System.out.print("��й�ȣ: ");
               password = sc.next();
               
               user = Bank.login(arrBank, arCount, account, password);
               
               if(user != null) {
                  System.out.println("���� �ܾ�: " + user.showBalance() + "��");
               }
               
               break;
            case 5: // ���¹�ȣ ã��
               System.out.print("�ڵ��� ��ȣ: ");
               phoneNumber = sc.next();
               
               user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
               
               if(user != null) {
                  System.out.print("��й�ȣ: ");
                  password = sc.next();

                  if(user.getPassword().equals(password)) {
                     
                     while(true) {
         //               ���¹�ȣ�� 0���� ���� ����
         //               for (int j = 0; j < ACCOUNT_LENGTH; j++) {
         //                  account += random.nextInt(10);
         //               }
                        
         //               ���¹�ȣ�� 1���� ���� ����
         //               100000 ~ 999999 -> 0 ~ 899999
                        account += random.nextInt(900000) + 100000;
                        
                        if(Bank.checkAccount(arrBank, arCount, account) == null) {
                           break;
                        }
                     }
                     user.setAccount(account);
                     System.out.println("�ٽô� �Ҿ������ ������.");
                     System.out.println("���� ���¹�ȣ: " + account);
                  }
               }
               break;
            }
         }
      }
   }
}
