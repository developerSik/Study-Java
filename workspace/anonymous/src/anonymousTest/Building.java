package anonymousTest;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks suwon = new Starbucks();
		
		suwon.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노","라뗴","그린 티"};
			}
		});
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if(menu[i].equals(order)) {
						
						System.out.println(order + "주문완료");
						return;
					}
				}
				System.out.println("없는 메뉴입니다.");
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"아메리카노","바닐라라떼","얼그레이티"};
			}
		});
	}
}
