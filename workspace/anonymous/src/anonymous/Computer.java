package anonymous;

public class Computer {
	public static void main(String[] args) {
		Game rpg = new Game() {
			
			@Override
			public void play() {
				System.out.println("�밡�� ���");
			}
			
			@Override
			public void exit() {
				System.out.println("���ݸ� ��ٸ��ø� ������ �����ؿ�.");
			}
		};
		
		rpg.play();
	}
}
