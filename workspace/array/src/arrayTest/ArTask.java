package arrayTest;

public class ArTask {
   public static void main(String[] args) {
//      �����
//      1~10���� �迭�� ��� ���
//      10~1���� �� ¦���� �迭�� ��� ���
//      1~100���� �迭�� ���� �� Ȧ���� ���
//	   	int[] arData = new int[100];
//	   	for(int i = 0; i < arData.length; i++) {
//	   		arData[i] += i;
//	   		if(arData[i] % 2 != 0) {
//	   			System.out.println(arData[i]);
//	   		}
//	   	
//	   	}
//      �ǹ�
//      1~100���� �迭�� ���� �� ¦���� �� ���
//	   	int [] arData = new int[100];
//	   	int  count = 0;
//	   	for(int i=0; i<arData.length; i++) {
//	   		arData[i] += i+1;   	   	
//	   		if(arData[i] % 2 == 0) {
//	   			 count += arData[i];
//	   		}		 	   		
//	   	}
//	   	System.out.println(count);
//      A~F���� �迭�� ��� ���
//	   	int[] arData = new int[6];
//	   	for(int i=0; i<6; i++) {
//	   		arData[i] += i+65; 
//	   		System.out.println((char)arData[i]);
//	   	}
//      A~F���� �� C�����ϰ� �迭�� ���� �� ���\
	   	int[] arData = new int[5];
	   	for(int i=0; i<5; i++) {  
	   		arData[i] += i+65;
	   		System.out.println((char)(arData[i] > 66 ? arData[2]  : arData[3]));
	   	}
      
//      ���
//      5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
      
//      ���̾�
//      ����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
      
   }
}

//package arrayTest;
//
//import java.util.Scanner;
//
//public class ArTask {
//   public static void main(String[] args) {
//      �����
//      1~10���� �迭�� ��� ���
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < 10; i++) {
//         arData[i] = i + 1;
//         System.out.println(arData[i]);
//      }
      
//      10~1���� �� ¦���� �迭�� ��� ���
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < 5; i++) {
//         arData[i] = 10 - i * 2;
//         System.out.println(arData[i]);
//      }
      
//      1~100���� �迭�� ���� �� Ȧ���� ���
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if(i % 2 != 0) {continue;}
//         System.out.println(arData[i]);
//      }
      
//      �ǹ�
//      1~100���� �迭�� ���� �� ¦���� �� ���
//      int[] arData = new int[100];
//      int total = 0;
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if(i % 2 == 0) {continue;}
//         total += arData[i];
//      }
//      
//      System.out.println(total);
      
//      A~F���� �迭�� ��� ���
      char[] arData = new char[6];
      
      for (int i = 0; i < arData.length; i++) {
         arData[i] = (char)(65 + i);
         System.out.println(arData[i]);
      }
      
//      for (char i = 'A'; i < 'G'; i++) {
//         arData[i-65] = i;
//         System.out.println(arData[i-65]);
//      }
      
//      A~F���� �� C�����ϰ� �迭�� ���� �� ���
//      char[] arData = new char[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//         System.out.println(arData[i]);
//      }
      
//      ���
//      5���� ������ �Է¹ް� �迭�� ���� �� �ִ밪�� �ּҰ� ���
//      int[] arData = new int[5];
//      Scanner sc = new Scanner(System.in);
//      String message = "5���� ������ �Է��ϼ���.";
//      int max = 0, min = 0;
//      
//      System.out.println(message);
//      for (int i = 0; i < arData.length; i++) {
//         System.out.print(i + 1 + "��° ����: ");
//         arData[i] = sc.nextInt();
//      }
//      
//      max = arData[0];
//      min = arData[0];
//      
//      for (int i = 1; i < arData.length; i++) {
//         if(max < arData[i]) {max = arData[i];}
//         if(min > arData[i]) {min = arData[i];}
//      }
//      
//      System.out.println("�ִ밪: " + max);
//      System.out.println("�ּҰ�: " + min);
      
//      ���̾�
//      ����ڰ� �Է��� ������ ������ŭ �迭�� ���� �� ������ �Է¹ް� ��� ���ϱ�
//      int[] arData = null;
//      int total = 0;
//      double average = 0.0;
//      Scanner sc = new Scanner(System.in);
//      
//      System.out.println("�� ���� ������ �Է��Ͻǰǰ���?");
//      arData = new int[sc.nextInt()];
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.print(i + 1 + "��° ����: ");
//         arData[i] = sc.nextInt();
//         total += arData[i];
//      }
//      average = Double.parseDouble(String.format("%.2f", (double)total / arData.length));
//      
//      System.out.println("���: " + average);
   }
}
