package ambiguity;

public class ClassC implements InterA, InterB {
	@Override
	public void printName() {
		InterA.super.printName();
	}
}
