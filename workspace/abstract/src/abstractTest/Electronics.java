package abstractTest;

public abstract class Electronics {
	public abstract void on();
	public abstract void off();
	public void printProduct() {}
	public final void sos() {System.out.println("긴급전화 119 연락");}
}
