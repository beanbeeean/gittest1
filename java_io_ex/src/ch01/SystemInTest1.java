package ch01;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {

		System.out.println("알파벳 하나를 쓰고 Enter를 누르세요.");

		int i;

		try {
			i = System.in.read(); // 입력을 기다리는 명령어

			// 출력

			System.out.println("입력 받은 값 : " + i);
			// 문제1
			// 화면에 i값을 A로 출력해주세요.
			System.out.println((char) i);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
