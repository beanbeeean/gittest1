package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {

		// 예약어 continue
		// 무시하고 진행하는 continue
		// 스캐너 이용해서 MAX 값
		// MULTIPLE값 받아서 프로그램을 완성해 주세요.
		System.out.println("최대 값을 입력해주세요 : ");
		Scanner scanner = new Scanner(System.in);
		final int MAX = scanner.nextInt();
		
		System.out.println("배수 값을 입력해주세요 : ");
		Scanner scanner1 = new Scanner(System.in);
		final int MULTIPLE = scanner1.nextInt();
		
		int num;
		int count = 0;

		for (num = 1; num < MAX; num++) {
			// 3의 배수이면 출력하지 마시오
			if ((num % MULTIPLE) == 0) {
				count++;
				continue;
			} // end of if
				
		} // end of for
		// System.out.println("출력 값 : " + num);
		System.out.println(MULTIPLE + "의 배수의 갯수 : " + count);
	} // end of main

}
