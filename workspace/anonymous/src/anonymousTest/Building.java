package anonymousTest;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		Starbucks suwon = new Starbucks();
		
		suwon.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��","���","�׸� Ƽ"};
			}
		});
		
		gangnam.register(new Form() {
			
			@Override
			public void sell(String order) {
				String[] menu = getMenu();
				for (int i = 0; i < menu.length; i++) {
					if(menu[i].equals(order)) {
						
						System.out.println(order + "�ֹ��Ϸ�");
						return;
					}
				}
				System.out.println("���� �޴��Դϴ�.");
			}
			
			@Override
			public String[] getMenu() {
				return new String[] {"�Ƹ޸�ī��","�ٴҶ��","��׷���Ƽ"};
			}
		});
	}
}
