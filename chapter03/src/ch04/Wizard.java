package ch04;

public class Wizard extends Hero{

	public Wizard(String name, int hp) {
		super(name, hp);
		
	}

	public void freezing() {
		System.out.println(this.name + "이(가) freezing을 시전합니다.");
	}
}
