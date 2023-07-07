package inheritance;
class Car{
	String brand;
	String color;
	int price;
	
	public Car() {;}

	public Car(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("¿­¼è ½Ãµ¿ ÄÑÁü");
	}
	
	void engineStop() {
		System.out.println("¿­¼è ½Ãµ¿ ²¨Áü");
	}
	
	
}

class SuperCar extends Car{
	String mode;
	
	public SuperCar() {;}

	public SuperCar(String brand, String color, int price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void engineStart() {
		super.engineStart();
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ ÄÑÁü");
	}
	
	@Override
	void engineStop() {
		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ ²¨Áü");
	}
}
public class InheritanceTask {
	public static void main(String[] args) {
		SuperCar ferrari = new SuperCar("Lambo", "Yellow", 25_000,"ho");
		
		ferrari.engineStart();
		
}
}
