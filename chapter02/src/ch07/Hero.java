package ch07;

public class Hero {

	private String name;
	private int hp;
	private double defense;
	private int level;
	
	// get
	public String getName() {
		return this.name;
	}
	
	// set
	public void setName(String name) {
		// ����� �ڵ� �ۼ�
		if(name == null || name == "" || name.length() < 2) {
			System.out.println("�߸��� �Է��Դϴ�. �̸��� �ٽ� �ۼ����ּ���.");
		}else {
			this.name = name;
		}
	}
	
	// hp , defense , level �� ���� get , set �޼���
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if(hp < 0) {
			System.out.println("�ٽ� �Է����ּ���.");
		}else {
			this.hp = hp;
		}
	}
	
	public double getDefense() {
		return this.defense;
	}

	public void setDefense(double defense) {
		if(defense < 0) {
			System.out.println("�ٽ� �Է��� �ּ���.");
		}else {
			this.defense = defense;
		}
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		if(level < 0) {
			System.out.println("�ٽ� �Է��� �ּ���.");
		}else{
			this.level = level;
		}
	}
	
	// main �Լ�
	public static void main(String[] args) {
		
		// Hero ��ü ���� �� getter, setter �޼��带 ����غ���.
		Hero hero = new Hero();
		hero.setName("īī��");
		String name = hero.getName();
		System.out.println("���� ���� �� : " + name);
		
	}
	
}
