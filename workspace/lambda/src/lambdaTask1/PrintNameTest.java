package lambdaTask1;

public class PrintNameTest {
	public static void printFullName(PrintName printname, String lastname, String firstname) {
		System.out.println(printname.getFullName(lastname, firstname));
	}
	public static void main(String[] args) {
		PrintNameTest.printFullName((l, f)-> l+f, "Á¤", "»ó½Ä");
		
	}
}
