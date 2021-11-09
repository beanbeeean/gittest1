package ch06;

public class Student {

	public int studentId;
	public String studentName;
	
	// 우리기 설계한 클래스를 참조 타입을 사용한다.
	Subject korea;
	private Subject math;
	
	// 생성자
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		
		// 참조 타입은 생성을 해야 사용할 수 있다.
		// 메모리에 존재하게 만들어야 한다.
		korea = new Subject();
		math = new Subject();
	}
	
	// 정보를 입력 받는 메서드 생성 (국어 과목에 대한 정보 세팅)
	public void setKoreaSubject(String name, int score) {
		korea.subjectName = name;
		korea.score = score;
	}
	
	// 수학과목
	public void setMathSubject(String name, int score) {
		math.subjectName = name;
		math.score = score;
		
	}
	
	// 학생의 총점을 화면에 출력하는 기능
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName + " 학생의 총점은 " + total + " 입니다.");
	}
}
