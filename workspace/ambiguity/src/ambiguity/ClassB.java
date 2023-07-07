package ambiguity;

public class ClassB extends ClassA implements InterA {
	@Override
	public void printName() {
		InterA.super.printName();
	}
	public static void main(String[] args) {
		new ClassB().printName();
	}
}
