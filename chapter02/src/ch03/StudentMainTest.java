package ch03;

public class StudentMainTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "��õ";

		studentLee.showStudentInfo();
		studentLee.takeTest();
		studentLee.cleanup();

		Student studentKim = new Student();
		studentKim.studentName = "������";
		studentKim.address = "����";
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
