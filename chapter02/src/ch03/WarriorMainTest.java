package ch03;

public class WarriorMainTest {

	public static void main(String[] args) {
		
		Warrior first = new Warrior();
		first.name = "ภüป็1";
		first.height = 187;
		first.power = 100;
		first.tier = "legend";
		
		first.showInfo();
		first.detailInfo();
		first.attack();
	}

}
