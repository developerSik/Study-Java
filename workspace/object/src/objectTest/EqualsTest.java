package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Student student = new Student(1, "정상식");
		boolean isSame = student.equals(new Student(1, "정상식"));
		System.out.println(isSame);
	}
}
