package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		두 정수 대소비교
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 0;
		String result = null;
		String message = "정수 두 개를 입력하세요";
		
		
		System.out.println(message);
		first = sc.nextInt();
		second = sc.nextInt();
		
		result = first > second ? "큰 값: " +first : second == second ? "두 수는 같습니다" : "큰 값: " +second;
		
		System.out.println(result);
	}
	
}
