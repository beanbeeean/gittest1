package ex1;

public class MainTest1 {

	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("����1", "����", 600, 300,20);
		Wizard z1 = new Wizard("������", "����", 500, 30,20);
		Wizard z2 = new Wizard("������2", "����2", 520, 30,20);
		
//		w1.showInfo();
//		System.out.println("==================");
//		z1.showInfo();
//		
//		w1.attacking(z1);
//		System.out.println("==================");
//		w1.showInfo();
//		System.out.println("==================");
//		z1.showInfo();
//		z1.attacking(w1);
//		System.out.println("==================");
//		w1.showInfo();
		
		w1.attacking(z1);
		z1.showInfo();
		System.out.println("-------------------");
		w1.attacking(z1);
		z1.showInfo();
		w1.showInfo();
	}

}
