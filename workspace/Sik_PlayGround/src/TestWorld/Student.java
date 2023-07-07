package TestWorld;

public class Student {
	int number;
	int korean;
	int english;
	int math;
	int total;
	int avg;
	public Student(int number, int korean, int english, int math) {
		super();
		this.number = number;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.total = korean + english + math;
		this.avg = avg / 3;
	}
	
	
}
