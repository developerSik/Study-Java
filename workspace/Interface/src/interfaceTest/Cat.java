package interfaceTest;

public class Cat implements Animal {

	@Override
	public void sitDown() {
		System.out.println("���� �ʴ´�.");
	}

	@Override
	public void showHands() {
		System.out.println("���� �ش�.");
	}

	@Override
	public void touchNose() {
		System.out.println("�� �˾� ��´�.");
	}

	@Override
	public void waitNow() {
		System.out.println("�ȵȴ�");
	}

	@Override
	public void poop() {
		System.out.println("�˾Ƽ� �Ѵ�.");
	}

	

}
