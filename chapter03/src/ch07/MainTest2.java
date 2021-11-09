package ch07;

public class MainTest2 {

	public static void main(String[] args) {
		
		Car aiCar = new AiCar();
		aiCar.run();
		System.out.println("-----------");
		
		Car manualCar = new ManualCar();
		manualCar.run();

	}

}

