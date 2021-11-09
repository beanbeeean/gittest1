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
		// 방어적 코드 작성
		if(name == null || name == "" || name.length() < 2) {
			System.out.println("잘못된 입력입니다. 이름을 다시 작성해주세요.");
		}else {
			this.name = name;
		}
	}
	
	// hp , defense , level 에 대한 get , set 메서드
	
	public int getHp() {
		return this.hp;
	}
	
	public void setHp(int hp) {
		if(hp < 0) {
			System.out.println("다시 입력해주세요.");
		}else {
			this.hp = hp;
		}
	}
	
	public double getDefense() {
		return this.defense;
	}

	public void setDefense(double defense) {
		if(defense < 0) {
			System.out.println("다시 입력해 주세요.");
		}else {
			this.defense = defense;
		}
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		if(level < 0) {
			System.out.println("다시 입력해 주세요.");
		}else{
			this.level = level;
		}
	}
	
	// main 함수
	public static void main(String[] args) {
		
		// Hero 객체 생성 후 getter, setter 메서드를 사용해보기.
		Hero hero = new Hero();
		hero.setName("카카오");
		String name = hero.getName();
		System.out.println("돌려 받은 값 : " + name);
		
	}
	
}
