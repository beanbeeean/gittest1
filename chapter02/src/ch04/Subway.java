package ch04;

public class Subway {

	// 호선 번호
	// 승객수
	// 수익금
	int lineNumber;
	int passengerCount;
	int money;
	
	// 생성자 - 호선번호를 받는 생성자
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	// 메서도 take, showInfo
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "호선 지하철의 승객은 " + passengerCount + "명 이고, "
				 + "수익금은 " + money + "원 입니다.");
	}
}
