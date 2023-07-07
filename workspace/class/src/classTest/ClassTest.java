package classTest;

class A{
	int data;
	
	void printData() {
		System.out.println(data);
	}
}

public class ClassTest {
	public static void main(String[] args) {
		A a = new A();
		a.printData();
	}
}
