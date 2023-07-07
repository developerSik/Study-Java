package TestWorld;

public class Store {
	String name;
	int price;
	int how;
	
	public Store(String name, int price, int how) {
		super();
		this.name = name;
		this.price = price;
		this.how = how;
	}
	
	void sell (Customer customer) {
		customer.money -= price * ((100-customer.account)*0.01);
		how--;
		
	}
}
