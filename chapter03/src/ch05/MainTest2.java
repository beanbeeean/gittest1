package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		
		final int BANANA = 1;
		final int PEACH = 2;
		
		// ��ĳ��
		// ����ڰ� �Է��� 1,2 ������ �ش��ϴ� ��ü�� ������ ȭ�鿡 ������ּ���.
		
		System.out.println("�ٳ��� : 1, ������ : 2");
		System.out.println("================");
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �Է��ϼ��� : ");
		int userInput = sc.nextInt();
		
		Fruit fruit;
		
		// ���� 1���̶�� �ٳ��� ��ü�� �����ϰ� showInfo �޼��� ȣ��
		if(userInput == BANANA) {
			fruit = new Banana();		
		}else {
			fruit = new Peach();			
		}
		
		fruit.showInfo();
		// ����ڰ� �Է��� ���� ���� �ν��Ͻ��� ���� �ٲ��� �� �ִ�.
		
		
	}

}
