package ch07;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("���� �����մϴ�.");
		System.out.println("�ڵ����� ������ ������ �ٲߴϴ�");
		
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
		
	}

	@Override
	public void wiper() {
		System.out.println("�ڵ����� �����۰� �����Դϴ�.");
		
	}
	
	@Override
	public void washCar() {
		System.out.println("������ ������ �մϴ�.");
	}
	

}
