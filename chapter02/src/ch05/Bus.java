package ch05;

public class Bus {

	// 버스 번호
	// 승객 수
	// 수익금
	
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
		System.out.println(busNumber + " 번의 승객은 ");
		System.out.println(passengerCount + "명 이고, ");
		System.out.println("현재 수익금은 " + money + "원 입니다");
	}
}
