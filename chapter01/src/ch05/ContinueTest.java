package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {

		// ����� continue
		// �����ϰ� �����ϴ� continue
		// ��ĳ�� �̿��ؼ� MAX ��
		// MULTIPLE�� �޾Ƽ� ���α׷��� �ϼ��� �ּ���.
		System.out.println("�ִ� ���� �Է����ּ��� : ");
		Scanner scanner = new Scanner(System.in);
		final int MAX = scanner.nextInt();
		
		System.out.println("��� ���� �Է����ּ��� : ");
		Scanner scanner1 = new Scanner(System.in);
		final int MULTIPLE = scanner1.nextInt();
		
		int num;
		int count = 0;

		for (num = 1; num < MAX; num++) {
			// 3�� ����̸� ������� ���ÿ�
			if ((num % MULTIPLE) == 0) {
				count++;
				continue;
			} // end of if
				
		} // end of for
		// System.out.println("��� �� : " + num);
		System.out.println(MULTIPLE + "�� ����� ���� : " + count);
	} // end of main

}
