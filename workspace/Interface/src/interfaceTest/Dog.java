package interfaceTest;

public class Dog implements Animal {

	@Override
	public void sitDown() {
		System.out.println("�ɴ´�");
	}

	@Override
	public void showHands() {
		System.out.println("�����ش�");
	}

	@Override
	public void touchNose() {
		System.out.println("�ڸ� ���δ�.");

	}

	@Override
	public void waitNow() {
		System.out.println("��ٸ���.");

	}

	@Override
	public void poop() {
		System.out.println("������ ��ҿ��� �ذ��Ѵ�.");

	}

}
