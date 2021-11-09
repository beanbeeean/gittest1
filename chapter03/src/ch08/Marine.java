package ch08;

public class Marine extends Unit{
	
	public Marine(String name) {
		this.name = name;
		this.power = 5;
		this.hp = 100;
	}

	public void showInfo() {
		System.out.println("===����â===");
		System.out.println("�̸� : " + this.name);
		System.out.println("���ݷ� : " + this.power);
		System.out.println("ü�� : " + this.hp);
		System.out.println("=========");
	}



	// getName
	public String getName() {
		return name;
	}

	// 1. �޼��� �����ε��� ����� ���� 2�� ~
	// �޼��� �����ε��� ����� ����.
	public void attack(Zealot zealot) {
		String targetName = zealot.getName();
		System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
		zealot.beAttacked(this.power);
	}

	public void attack(Zergling zergling) {
		String targetName = zergling.getName();
		System.out.println(this.name + "��(��)" + targetName + "�� ���� �մϴ�.");
		zergling.beAttacked(this.power);
	}

}
