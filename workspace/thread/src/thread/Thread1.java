package thread;

import java.util.Iterator;

public class Thread1 extends Thread{
	private String data;
	 
	public Thread1() {;}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	
	public Thread1(String data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.println(data);
		}
	}
	
}
