package markerInterfaceTest;


public class Lab {
	public void checkKinds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			if(animals[i] instanceof CarnivoreMarker) {
				System.out.println("���ĵ���");
			}
			else if(animals[i] instanceof HerbivoreMarker) {
				System.out.println("�ʽ� ����");
			}else {
				System.out.println("��� ����");
			}
		}
	}
	public static void main(String[] args) {
		Animal[] animals = { new Cow(), new Dog(), new Tiger(), new Bear()};
		
		new Lab().checkKinds(animals);
	}
}

	
