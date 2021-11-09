package ex1;

import java.util.Random;

public class Warrior {

	// 멤버 변수 설계
	// hp, power, level ...
	private String name;
	private String tier;
	private int hp;
	private int power;
	private int level;

	// 생성자도 만들어 주세요.
	public Warrior(String name, String tier, int level, int hp, int power) {
		this.name = name;
		this.tier = tier;
		this.hp = hp;
		this.power = power;
		this.level = level;
	}

	// 메서드
	// 전사가 공격한다.
	public void attacking(Wizard wizard) {
		System.out.println(name + "이/가 공격합니다.");
		System.out.println(power + "의 데미지를 줍니다.");
		wizard.be_attacked(this.power);

	}

	public void be_attacked(int power) {
		hp -= power;
		if (hp <= 0) {
			System.out.println("상대가 죽었습니다.");
		}
	}

	// 상태창을 꾸며서 볼 수 있는 기능을 만들어 주세요.
	public void showInfo() {
		System.out.println("********* 상태창 *********");
		System.out.println("이름 : " + name);
		System.out.println("티어 : " + tier);
		System.out.println("레벨 : " + level);
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
			System.out.println("다시 입력해주세요.");
		} else {
			this.name = name;
		}
	}

	public String getTier() {
		return this.tier;
	}

	public void setTier(String tier) {
		if (tier == "") {
			System.out.println("다시 입력해주세요.");
		} else {
			this.tier = tier;
		}
	}

	public int getLevel() {
		return this.level;
	}

	public void setLevel(int level) {
		if (level < 0) {
			System.out.println("다시 입력해주세요.");
		} else {
			this.level = level;
		}
	}

	public int getHp() {
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("다시 입력해주세요.");
		} else {
			this.hp = hp;
		}
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		if (power < 0) {
			System.out.println("다시 입력해주세요.");
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
