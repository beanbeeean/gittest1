package ch04;

public class Subway {

	// ȣ�� ��ȣ
	// �°���
	// ���ͱ�
	int lineNumber;
	int passengerCount;
	int money;
	
	// ������ - ȣ����ȣ�� �޴� ������
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// �޼��� take, showInfo
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "ȣ�� ����ö�� �°��� " + passengerCount + "�� �̰�, "
				 + "���ͱ��� " + money + "�� �Դϴ�.");
	}
}
