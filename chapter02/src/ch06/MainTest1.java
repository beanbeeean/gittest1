package ch06;

public class MainTest1 {

	public static void main(String[] args) {
	
		Student studentLee = new Student(1, "Lee");
		studentLee.setKoreaSubject("국어", 100);
		studentLee.setMathSubject("수학", 90);
		studentLee.showStudentScore();
		
		Student studentKim = new Student(2,"Kim");
		studentKim.setKoreaSubject("국어", 80);
		studentKim.setMathSubject("수학", 65);
		studentKim.showStudentScore();
		
		Student studentPark = new Student(3,"Park");
		studentPark.setKoreaSubject("국어", 70);
		studentPark.setMathSubject("수학", 95);
		studentPark.showStudentScore();
		
	}

}
