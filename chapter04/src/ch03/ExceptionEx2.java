package ch03;

import java.io.FileInputStream;

public class ExceptionEx2 {
	public static void main(String[] args) {

		FileInputStream fis;

		try {
			fis = new FileInputStream("a.txt");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (Exception e) {
			System.out.println("예외 처리");
			return; // 심지어 return문이 있어도 finally는 반드시 실행 됨.
		} finally {
			// finally에 있는 코드는 try 문이 실행되면 반드시 실행 됨.
			System.out.println("반드시 실행됩니다.");
		}

		System.out.println("비정상 종료가 되지 않았습니다.");

	}

}
