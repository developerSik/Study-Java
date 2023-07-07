package anonymousTask;

public class Nikebonsa {
	public void register(Form form){
		String[] shoe = form.shoes();
		
		for (int i = 0; i < shoe.length; i++) {
			System.out.println(shoe[i]);
		}
		
		form.sell("Á¶´ø");
		}
}
