package inputTest;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message = "덧셈 할 세개의 정수를 입력하세요. : ";
		String example = "예) 1 2 3 ";
		String format = "%d + %d + %d = %d";
		int First = 0;
		int Second = 0;
		int Third = 0;
		int hap = 0;
		
		
		System.out.println(message);
		System.out.println(example);
		First = sc.nextInt();
		Second = sc.nextInt();
		Third = sc.nextInt();
		hap = First + Second + Third;
		
		System.out.printf(format, First, Second, Third, hap);
	}
}
