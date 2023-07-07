package TestWorld;

public class StudentTest {
	int stuNumber;
	int korean;
	int math;
	int english;
	double avg = 0.0;
	int total = 0;
	
	public StudentTest() {;	}
	
	public StudentTest(int stuNumber, int korean, int math, int english) {
		this.stuNumber = stuNumber;
		this.korean = korean;
		this.math = math;
		this.english = english;
		this.total = korean + math + english;
		this.avg = total / 3;
	
	
	
	}	
}
