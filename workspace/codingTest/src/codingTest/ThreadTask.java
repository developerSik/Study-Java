package codingTest;

// 3���� �����尡 �ִ�.
// Thread1, Thread2, Thread3
// ����ڰ� �Է��� ������� �� �˸´� ���ڿ��� ��µȴ�.

// �Է� ��) 3 1 2
// ��� ��) third first second

// ��, Thread���� �׻� 1, 2, 3 ������ ����Ǿ�� �Ѵ�.

// Thread1 : third
// Thread2 : first
// Thread3 : second

// ��� �� �������� ��ȣ�� ����� ��� ���������� ó���Ѵ�.

public class ThreadTask implements Runnable {
	
	public ThreadTask() {;}

	public void printFirst(Runnable first) {
		first.run(); // ���� ����
	}

	public void printSecond(Runnable second) {
		second.run(); // ���� ����
	}

	public void printThird(Runnable third) {
		third.run(); // ���� ����
		
	}

	@Override
	public void run() {
		switch(Thread.currentThread().getName()) {
		case "1":
			printFirst(() -> System.out.println("first"));
		case "2":
			printSecond(() -> System.out.println("Second"));
		case "3":
			printThird(() -> System.out.println("Third"));
		}
	}
	
	
}





