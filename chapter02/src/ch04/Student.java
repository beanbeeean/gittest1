package ch04;

public class Student {

	// ������ - constructor
	// ��ü�� ������ �� ������ ���� ������� ������ ����.
	int number;
	String name;
	int grade;

	// �⺻ ������
	// ����� ���� ������ ���°�쿡��
	// �����Ϸ��� �˾Ƽ� �⺻ �����ڸ� ������ش�.
	public Student() {
		
	}
	
	// ������ �����
	public Student(int num, String name, int grade) {
		number = num;
		// �Ű����� �̸��� ������� �̸��� ���ٸ� this. Ű���带 ����ؼ� ����
		this.name = name;
		this.grade = grade;
	}

	// �޼���
	public void showInfo() {
		System.out.println(name + " �л��� �й��� " + number + " �Դϴ�." + "\n�г��� " + grade + "�г� �Դϴ�.");
	}
}
