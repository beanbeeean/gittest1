package ch04;

public class SubwayMainTest {

	public static void main(String[] args) {
		
		Subway subway1 = new Subway(1);
		Subway subway2 = new Subway(2);
		Subway subway3 = new Subway(3);
		
		subway1.take(1300);
		subway1.take(1400);
		subway1.showInfo();
		System.out.println("===========");
		
		subway2.take(1300);
		subway2.take(1400);
		subway2.showInfo();
		System.out.println("===========");
		
		subway3.take(1300);
		subway3.take(1400);
		subway3.showInfo();
		System.out.println("===========");
	}

}
