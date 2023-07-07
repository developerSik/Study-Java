package anonymous;

public class Computer {
	public static void main(String[] args) {
		Game rpg = new Game() {
			
			@Override
			public void play() {
				System.out.println("노가다 사냥");
			}
			
			@Override
			public void exit() {
				System.out.println("조금만 기다리시면 보상이 도착해요.");
			}
		};
		
		rpg.play();
	}
}
