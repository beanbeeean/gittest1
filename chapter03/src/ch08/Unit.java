package ch08;

public class Unit {
	
	protected int power;
	protected int hp;
	protected String name;
	
	// 공격 당합니다.
		public void beAttacked(int power) {
			this.hp -= power;
			if (this.hp <= 0) {
				System.out.println(this.name + "은 사망하였습니다.");
				this.hp = 0;
			}
		}
}
