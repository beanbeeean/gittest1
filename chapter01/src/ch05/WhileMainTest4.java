package ch05;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {

		// ����ڰ� 0�� �Է��ϸ� ���α׷��� ������Ѷ�.
		// ����ڰ� �Է��� ���� ��� �����ϴ� ���α׷����� ���� ���Ѷ�

		// do ~ while
		// scanner�� ����ؼ� ������� �Է°��� �޾Ƽ� ���������� ���ּ���.
		// ������ ����� ȭ�鿡 ����ϴ� ���α׷��� ������ּ���.

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int num = 0;

		do {
			System.out.println("���� �Է��ϼ��� : ");
			num = scanner.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println("������ ��� ���� " + sum + "�Դϴ�.");
		
//		for(int i =0; i < 3; i++) {
//			System.out.println("���� �Է��ϼ��� : ");
//			num = scanner.nextInt();
//			sum += num;
//		}
//		System.out.println("������ ��� ���� " + sum + "�Դϴ�.");
	}

}
