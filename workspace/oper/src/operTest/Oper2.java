package operTest;

import java.util.Scanner;

public class Oper2 {
	public static void main(String[] args) {
//		�� ���� ��Һ�
		Scanner sc = new Scanner(System.in);
		int first = 0;
		int second = 0;
		String result = null;
		String message = "���� �� ���� �Է��ϼ���";
		
		
		System.out.println(message);
		first = sc.nextInt();
		second = sc.nextInt();
		
		result = first > second ? "ū ��: " +first : second == second ? "�� ���� �����ϴ�" : "ū ��: " +second;
		
		System.out.println(result);
	}
	
}
