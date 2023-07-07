package arrayTest;

public class ArTask {
   public static void main(String[] args) {
//      브론즈
//      1~10까지 배열에 담고 출력
//      10~1까지 중 짝수만 배열에 담고 출력
//      1~100까지 배열에 담은 후 홀수만 출력
//	   	int[] arData = new int[100];
//	   	for(int i = 0; i < arData.length; i++) {
//	   		arData[i] += i;
//	   		if(arData[i] % 2 != 0) {
//	   			System.out.println(arData[i]);
//	   		}
//	   	
//	   	}
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
//	   	int [] arData = new int[100];
//	   	int  count = 0;
//	   	for(int i=0; i<arData.length; i++) {
//	   		arData[i] += i+1;   	   	
//	   		if(arData[i] % 2 == 0) {
//	   			 count += arData[i];
//	   		}		 	   		
//	   	}
//	   	System.out.println(count);
//      A~F까지 배열에 담고 출력
//	   	int[] arData = new int[6];
//	   	for(int i=0; i<6; i++) {
//	   		arData[i] += i+65; 
//	   		System.out.println((char)arData[i]);
//	   	}
//      A~F까지 중 C제외하고 배열에 담은 후 출력\
	   	int[] arData = new int[5];
	   	for(int i=0; i<5; i++) {  
	   		arData[i] += i+65;
	   		System.out.println((char)(arData[i] > 66 ? arData[2]  : arData[3]));
	   	}
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
      
   }
}

//package arrayTest;
//
//import java.util.Scanner;
//
//public class ArTask {
//   public static void main(String[] args) {
//      브론즈
//      1~10까지 배열에 담고 출력
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < 10; i++) {
//         arData[i] = i + 1;
//         System.out.println(arData[i]);
//      }
      
//      10~1까지 중 짝수만 배열에 담고 출력
//      int[] arData = new int[10];
//      
//      for (int i = 0; i < 5; i++) {
//         arData[i] = 10 - i * 2;
//         System.out.println(arData[i]);
//      }
      
//      1~100까지 배열에 담은 후 홀수만 출력
//      int[] arData = new int[100];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = i + 1;
//         if(i % 2 != 0) {continue;}
//         System.out.println(arData[i]);
//      }
      
//      실버
//      1~100까지 배열에 담은 후 짝수의 합 출력
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
      
//      A~F까지 배열에 담고 출력
      char[] arData = new char[6];
      
      for (int i = 0; i < arData.length; i++) {
         arData[i] = (char)(65 + i);
         System.out.println(arData[i]);
      }
      
//      for (char i = 'A'; i < 'G'; i++) {
//         arData[i-65] = i;
//         System.out.println(arData[i-65]);
//      }
      
//      A~F까지 중 C제외하고 배열에 담은 후 출력
//      char[] arData = new char[5];
//      
//      for (int i = 0; i < arData.length; i++) {
//         arData[i] = (char)(i > 1 ? i + 66 : i + 65);
//         System.out.println(arData[i]);
//      }
      
//      골드
//      5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값 출력
//      int[] arData = new int[5];
//      Scanner sc = new Scanner(System.in);
//      String message = "5개의 정수를 입력하세요.";
//      int max = 0, min = 0;
//      
//      System.out.println(message);
//      for (int i = 0; i < arData.length; i++) {
//         System.out.print(i + 1 + "번째 정수: ");
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
//      System.out.println("최대값: " + max);
//      System.out.println("최소값: " + min);
      
//      다이아
//      사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고 평균 구하기
//      int[] arData = null;
//      int total = 0;
//      double average = 0.0;
//      Scanner sc = new Scanner(System.in);
//      
//      System.out.println("몇 개의 정수를 입력하실건가요?");
//      arData = new int[sc.nextInt()];
//      
//      for (int i = 0; i < arData.length; i++) {
//         System.out.print(i + 1 + "번째 정수: ");
//         arData[i] = sc.nextInt();
//         total += arData[i];
//      }
//      average = Double.parseDouble(String.format("%.2f", (double)total / arData.length));
//      
//      System.out.println("평균: " + average);
   }
}
