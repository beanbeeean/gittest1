package ch06;

public class MainTest1 {

	public static void main(String[] args) {
	
		Student studentLee = new Student(1, "Lee");
		studentLee.setKoreaSubject("����", 100);
		studentLee.setMathSubject("����", 90);
		studentLee.showStudentScore();
		
		Student studentKim = new Student(2,"Kim");
		studentKim.setKoreaSubject("����", 80);
		studentKim.setMathSubject("����", 65);
		studentKim.showStudentScore();
		
		Student studentPark = new Student(3,"Park");
		studentPark.setKoreaSubject("����", 70);
		studentPark.setMathSubject("����", 95);
		studentPark.showStudentScore();
		
	}

}
