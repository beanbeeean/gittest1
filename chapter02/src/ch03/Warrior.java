package ch03;

public class Warrior {

	// �������
	public int height;
	public int power;
	public String name;
	public String tier;
	
	public void showInfo() {
		System.out.println(name + " (" + tier + ")");
	}
	
	public void detailInfo() {
		System.out.println("Ű : " + height + " / �Ŀ� : " + power);
	}
	
	public void attack() {
		System.out.println("�⺻ ����");
	}
}
