package TestWorld;

class Animal{
	String name;
	
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	void setName(String name) {
		this.name = name;
	}
}

class Dog extends Animal{
	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.println(this.name + "¢��");
	}
}

class HouseDog extends Dog {
	public HouseDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.println(this.name + "¢�� �ڱ�");
	}

	public void bark(int hour) {
		System.out.println(this.name +"�� �ڰ��ִ�" + hour + " ����");
	}
}
public class Sample {
	public static void main(String[] args) {
		HouseDog dog = new HouseDog("Ma");
		
		dog.bark();
		dog.bark(2);
		
		
		
	
	
	}
	
	
	
	}