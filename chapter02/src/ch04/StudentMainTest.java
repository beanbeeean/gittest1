package ch04;

public class StudentMainTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "홍길동", 3);
		System.out.println(s1.number);
		System.out.println(s1.name);
		System.out.println(s1.grade);
		
		s1.showInfo();
		
		// 기본 생성자로 객체 생성
		Student s2 = new Student();
		
		s2.number = 2;
		s2.name = "이순신";
		s2.grade = 2;
		
		System.out.println(s2.number);
		System.out.println(s2.name);
		System.out.println(s2.grade);
		
	}

}
