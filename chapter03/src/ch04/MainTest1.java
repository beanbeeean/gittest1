package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		Wizard wiz1 = new Wizard("마법사1", 100);
		Warrior war1 = new Warrior("전사1" , 200);
		Archer arc1 = new Archer("궁수1", 150);
		
		wiz1.attack();
		war1.attack();
		wiz1.freezing();
	}

}
