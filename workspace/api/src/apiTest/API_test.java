package apiTest;

public class API_test {
	public static void main(String[] args) {
		Calc calc = new Calc();
		try {
			System.out.println(calc.divide(10, 3));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
}
