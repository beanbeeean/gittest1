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
	
	// 1. ������ ģ��.
	public void takeTest() {
		System.out.println(studentName + "�л��� ������ ģ��.");
	}
	
	// 2. û�Ҹ� �Ѵ�.
	public void cleanup() {
		System.out.println(studentName + "�л��� û�Ҹ� �Ѵ�.");
	}
}
