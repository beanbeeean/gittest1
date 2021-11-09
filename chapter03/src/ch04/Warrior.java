package ch04;

public class Warrior extends Hero{

	public Warrior(String name, int hp) {
		super(name, hp);
	}

	public void comboAttack() {
		System.out.println(this.name + "이(가) comboAttack을 시전합니다.");
	}
}
