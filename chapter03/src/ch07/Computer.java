package ch07;

public abstract class Computer {

	// 추상 메서드
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
