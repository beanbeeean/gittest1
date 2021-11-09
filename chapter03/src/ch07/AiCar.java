package ch07;

public class AiCar extends Car{

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 스스로 방향을 바꿉니다");
		
	}

	@Override
	public void stop() {
		System.out.println("자동으로 정지합니다.");
		
	}

	@Override
	public void wiper() {
		System.out.println("자동으로 와이퍼가 움직입니다.");
		
	}
	
	@Override
	public void washCar() {
		System.out.println("스스로 세차를 합니다.");
	}
	

}
