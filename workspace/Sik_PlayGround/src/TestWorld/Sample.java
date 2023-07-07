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
		System.out.println(this.name + "짖기");
	}
}

class HouseDog extends Dog {
	public HouseDog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public void bark() {
		System.out.println(this.name + "짖고 자기");
	}

	public void bark(int hour) {
		System.out.println(this.name +"은 자고있다" + hour + " 동안");
	}
}
public class Sample {
	public static void main(String[] args) {
		HouseDog dog = new HouseDog("Ma");
		
		dog.bark();
		dog.bark(2);
		
		
		
	
	
	}
	
	
	
	}