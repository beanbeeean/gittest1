package ch05;

public class Bus {

	// ���� ��ȣ
	// �°� ��
	// ���ͱ�
	
	int busNumber;
	int passengerCount;
	int money;
	
	public Bus(int num) {
		busNumber = num;	
	}
	
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + " ���� �°��� ");
		System.out.println(passengerCount + "�� �̰�, ");
		System.out.println("���� ���ͱ��� " + money + "�� �Դϴ�");
	}
}
