package anonymousTask;

public class Store {
	public static void main(String[] args) {
	Nikebonsa suwon = new Nikebonsa();
	
	suwon.register(new Form() {
		
		@Override
		public String[] shoes() {
			return new String[] {"����","��������","��ȭ"};
		}
		
		@Override
		public void sell(String order) {
			String[] shoes = shoes();
		}
	});
	
}
}
