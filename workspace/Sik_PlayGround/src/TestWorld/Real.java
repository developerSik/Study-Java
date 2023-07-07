package TestWorld;

public class Real {
	public static void main(String[] args) {
		Store a = new Store("과자", 1500, 50);
		Customer customer = new Customer("정상식","01002020202",10000,50);
		Student stu = new Student(1,100,100,200);
		
		System.out.println(stu.avg);
		
		
		
		
		
		a.sell(customer);
		System.out.println(customer.money);
		System.out.println(a.how);
		a.sell(customer);
		System.out.println(customer.money);
		System.out.println(a.how);
	}
}
