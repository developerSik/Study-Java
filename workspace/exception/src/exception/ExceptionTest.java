package exception;

public class ExceptionTest {
	public static void main(String[] args) {
//		int[] arData = new int[5];
//		
//		try {
//			arData[5] = 10;
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Ä­À» ³Ñ¾î°¬½À´Ï´Ù.");
//		}
//		
			try {
				System.out.println(10 / 0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}
