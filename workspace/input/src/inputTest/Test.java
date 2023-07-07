package inputTest;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data1 = null;
		int data2;
		float data3;
		
		data1 = sc.next();
		data2 = sc.nextInt();
		data3 = sc.nextFloat();
		
		System.out.println("¿Ã∏ß = ", data1);
		System.out.println(data2);
		System.out.println(data3);
		
	}
}
