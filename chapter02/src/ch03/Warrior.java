package ch03;

public class Warrior {

	// 멤버변수
	public int height;
	public int power;
	public String name;
	public String tier;
	
	public void showInfo() {
		System.out.println(name + " (" + tier + ")");
	}
	
	public void detailInfo() {
		System.out.println("키 : " + height + " / 파워 : " + power);
	}
	
	public void attack() {
		System.out.println("기본 공격");
	}
}
