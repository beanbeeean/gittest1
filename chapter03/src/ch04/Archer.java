package ch04;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);
	}

	public void fireArrow() {
		System.out.println(this.name + "이(가) fireArrow를 시전합니다.");
	}
}
