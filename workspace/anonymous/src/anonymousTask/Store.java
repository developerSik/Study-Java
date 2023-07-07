package anonymousTask;

public class Store {
	public static void main(String[] args) {
	Nikebonsa suwon = new Nikebonsa();
	
	suwon.register(new Form() {
		
		@Override
		public String[] shoes() {
			return new String[] {"조던","에어포스","단화"};
		}
		
		@Override
		public void sell(String order) {
			String[] shoes = shoes();
		}
	});
	
}
}
