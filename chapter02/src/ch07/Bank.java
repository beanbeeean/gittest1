package ch07;

public class Bank {

	private int balance;
	
	// �޼���
	
	// �Աݱ��
	public void deposit(int money) {
		this.balance += money;
	}
	
	// ���
	public int withdraw(int money) {
		this.balance -= money;
		return money;
	}
	
	public void showInfo() {
		System.out.println("���� �ܾ��� " + this.balance + "�� �Դϴ�.");
	}
	
	// getter �޼��� �����
	// �Ϲ������� get() �޼��带 ���� �ܺο��� Ȯ���� �� �ֵ��� ����
	public int getBalance() {
		return this.balance;
	}
	
	// setter �޼��� �����
	// �Ϲ��� set() �޼��带 �����ؼ� �ܺο��� ��� ������ ������ �� �ֵ��� ����
	public void setBalance(int balance) {
		if(balance < 0) {
			System.out.println("�߸��� �Է� �Դϴ�.");
		}else {
			this.balance = balance;
		}
		
	}
	
}


// public class�� .java ���Ͼȿ� �� �ϳ��� ����� �� �ִ�.
class Student{
	
}