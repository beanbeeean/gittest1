package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		Wizard wiz1 = new Wizard("������1", 100);
		Warrior war1 = new Warrior("����1" , 200);
		Archer arc1 = new Archer("�ü�1", 150);
		
		wiz1.attack();
		war1.attack();
		wiz1.freezing();
	}

}
