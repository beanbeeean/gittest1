package ch03;

public class StudentMainTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "인천";

		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanup();

		Student studentKim = new Student();
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		studentKim.showStudentInfo();

		studentKim.takeTest();
		studentKim.cleanup();

		System.out.println("-----------------------");
		String name1 = studentKim.getStudentName();
		System.out.println("name1 : " + name1);

		String name2 = studentLee.getStudentName();
		System.out.println("name2 " + name2);

	}

}
