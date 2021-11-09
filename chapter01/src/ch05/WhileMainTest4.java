package ch05;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {

		// 사용자가 0을 입력하면 프로그램을 종료시켜라.
		// 사용자가 입력한 값을 계속 덧셈하는 프로그램으로 변경 시켜라

		// do ~ while
		// scanner를 사용해서 사용자의 입력값을 받아서 덧셈연산을 해주세요.
		// 연산의 결과를 화면에 출력하는 프로그램을 만들어주세요.

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int num = 0;

		do {
			System.out.println("값을 입력하세요 : ");
			num = scanner.nextInt();
			sum += num;
		} while (num != 0);
		System.out.println("연산의 결과 값은 " + sum + "입니다.");
		
//		for(int i =0; i < 3; i++) {
//			System.out.println("값을 입력하세요 : ");
//			num = scanner.nextInt();
//			sum += num;
//		}
//		System.out.println("연산의 결과 값은 " + sum + "입니다.");
	}

}
