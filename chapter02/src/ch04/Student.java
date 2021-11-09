package ch04;

public class Student {

	// 생성자 - constructor
	// 객체를 생성할 때 다음과 같은 모양으로 만들라고 지시.
	int number;
	String name;
	int grade;

	// 기본 생성자
	// 사용자 정의 생성자 없는경우에는
	// 컴파일러가 알아서 기본 생성자를 만들어준다.
	public Student() {
		
	}
	
	// 생성자 만들기
	public Student(int num, String name, int grade) {
		number = num;
		// 매개변수 이름과 멤버변수 이름이 같다면 this. 키워드를 사용해서 구분
		this.name = name;
		this.grade = grade;
	}

	// 메서드
	public void showInfo() {
		System.out.println(name + " 학생의 학번은 " + number + " 입니다." + "\n학년은 " + grade + "학년 입니다.");
	}
}
