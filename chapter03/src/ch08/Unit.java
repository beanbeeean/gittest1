package ch08;

public class Unit {
	
	protected int power;
	protected int hp;
	protected String name;
	
	// ���� ���մϴ�.
		public void beAttacked(int power) {
			this.hp -= power;
			if (this.hp <= 0) {
				System.out.println(this.name + "�� ����Ͽ����ϴ�.");
				this.hp = 0;
			}
		}
}
