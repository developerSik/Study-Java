package staticTest;

class Data {
	int data = 10;
	static int data_s = 10;
	
	void increase() {
		System.out.println(++data);
	}
	
	void increase_s() {
		System.out.println(++data_s);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		Data data = new Data();
		
		data.increase();
	}
}
