package ch07;

public abstract class Car {

	public final void startCar() {
		System.out.println("�õ��� �Ѵ�.");
	}
	
	public final void turnOff() {
		System.out.println("�õ��� ����.");
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void wiper();
	
	// ��ũ(hook) �޼���
	public void washCar() {
		
	}
	// �ٽ�
	// ���� Ŭ�������� ������ �� �� ���� �ؾ��Ѵ�.
	final	public void run() {
		startCar();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
	
	
}
