package thread;

public class ThreadTest {
	public static void main(String[] args) {
		Runnable mineral = new Thread2();
		
		Thread t1 = new Thread(mineral,"?");
		Thread t2 = new Thread(mineral,"!");
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			
		} catch (InterrputedException e) {
		}
		
		System.out.println("���ξ����� ����");
//		thread1.start();
//		thread2.start();
		
//		thread1.run();
//		thread2.run();
	}
	
	
	
}
