package objectTest;

public class StringTest {
	public static void main(String[] args) {
		String data1 = "ABC";
		String data2 = "ABC";
		String data3 = new String("ABC");
		String data4 = new String("ABC");
		
		System.out.println(data1.equals(data4));
		
	}
}
