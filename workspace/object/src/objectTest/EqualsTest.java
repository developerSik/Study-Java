package objectTest;

public class EqualsTest {
	public static void main(String[] args) {
		Student student = new Student(1, "�����");
		boolean isSame = student.equals(new Student(1, "�����"));
		System.out.println(isSame);
	}
}
