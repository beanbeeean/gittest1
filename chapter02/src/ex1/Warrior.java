package ex1;

import java.util.Random;

public class Warrior {

	// ��� ���� ����
	// hp, power, level ...
	private String name;
	private String tier;
	private int hp;
	private int power;
	private int level;

	// �����ڵ� ����� �ּ���.
	public Warrior(String name, String tier, int level, int hp, int power) {
		this.name = name;
		this.tier = tier;
		this.hp = hp;
		this.power = power;
		this.level = level;
	}

	// �޼���
	// ���簡 �����Ѵ�.
	public void attacking(Wizard wizard) {
		System.out.println(name + "��/�� �����մϴ�.");
		System.out.println(power + "�� �������� �ݴϴ�.");
		wizard.be_attacked(this.power);

	}

	public void be_attacked(int power) {
		hp -= power;
		if (hp <= 0) {
			System.out.println("��밡 �׾����ϴ�.");
		}
	}

	// ����â�� �ٸ缭 �� �� �ִ� ����� ����� �ּ���.
	public void showInfo() {
		System.out.println("********* ����â *********");
		System.out.println("�̸� : " + name);
		System.out.println("Ƽ�� : " + tier);
		System.out.println("���� : " + level);
		if (hp > 0) {
			System.out.println("HP : " + hp);
		} else {
			System.out.println("HP : X");
		}
		System.out.println("POWER : " + power);
		System.out.println("***********************");
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == "") {
			System.out.println("�ٽ� �Է����ּ���.");
		} else {
			this.name = name;
		}
	}

	public String getTier() {
		return this.tier;
	}

	public void setTier(String tier) {
		if (tier == "") {
			System.out.println("�ٽ� �Է����ּ���.");
		} else {
			this.tier = tier;
		}
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		if (level < 0) {
			System.out.println("�ٽ� �Է����ּ���.");
		} else {
			this.level = level;
		}
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("�ٽ� �Է����ּ���.");
		} else {
			this.hp = hp;
		}
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		if (power < 0) {
			System.out.println("�ٽ� �Է����ּ���.");
		} else {
			this.power = power;
		}

	}

//	public static void returnRandon() {
//		Random random = new Random();
//		int number = random.nextInt(21);
//		System.out.println(number);
//	}
}
