package ex01;

import java.io.IOException;
import java.io.InputStreamReader;

public class SysInEx1 {

	public static void main(String[] args) {

		System.out.println("���ڸ� �Է��ϰ� Enter");

		int i;

		InputStreamReader irs = new InputStreamReader(System.in);

		try {
			while ((i = irs.read()) != '\n') {
				System.out.print((char) i);

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
