package ch03;

public class Student {

	public int studentID;
	public String studentName;
	public String address;
	
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	// 1. 시험을 친다.
	public void takeTest() {
		System.out.println(studentName + "학생이 시험을 친다.");
	}
	
	// 2. 청소를 한다.
	public void cleanup() {
		System.out.println(studentName + "학생이 청소를 한다.");
	}
}
