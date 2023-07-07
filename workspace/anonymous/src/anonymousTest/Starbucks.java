package anonymousTest;

public class Starbucks {
	public void register(Form form) {
		String[] menu = form.getMenu();
		
		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}
		if(form instanceof FormAdapter) {
			System.out.println("무료 나눔 매장입니다.");
			return;
		}
		form.sell("얼그레이티");
	}
}
