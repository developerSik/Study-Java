package operTest;

import java.util.Scanner;

public class Oper4 {
	public static void main(String[] args) {
//		      �ɸ� �׽�Ʈ
//		      
//		      Q. ����� �����ϴ� ���� �����ϼ���.
//		      1. ������
//		      2. �����
//		      3. ������
//		      4. ���
//		      
//		      ������ : �Ұ��� �������̰� �������̴�.
//		      ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�.
//		      ������ : �����ϰ� ����ϰ� ��ö�ϰ� ������.
//		      ��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����.
		   
		Scanner sc = new Scanner(System.in);
		String message = " ����� �����ϴ� ���� �Է��ϼ���. 1.������ 2.����� 3.������ 4.���";
		int firstNumber = 0;
		String result = null;
	
		System.out.println(message);
		firstNumber = sc.nextInt();
		
		result = firstNumber == 1 ? "������: �Ұ��� �������̰� �������̴�." : firstNumber == 2 ? " ����� : �߶��ϰ� ��� �Ϳ��� �����ְ� ���ϴ�." : firstNumber == 3 ? "������ : �����ϰ� ����ϰ� ��ö�ϰ� ������." : firstNumber == 4 ? "��� : õ�簰�� ����ϰ� ������ �����ϰ� ������� ����." : "���� ��ȣ�Դϴ�";
		
		System.out.println(result);
		
		
	}
	
}

