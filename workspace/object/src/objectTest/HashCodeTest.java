package objectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = new String("ABC");
		
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		
		
//		Random random = new Random(10);
//		System.out.println();
	}
}