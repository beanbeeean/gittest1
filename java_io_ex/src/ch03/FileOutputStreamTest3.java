package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {

		try (FileOutputStream fos = new FileOutputStream("output3.txt")) {

//			byte[] bs = new byte[26];
//			byte data = 65;
//			for (int i = 0; i < bs.length; i++) {
//				bs[i] = data;
//				data++;
//			}
//			fos.write(bs, 2, 10); // 배열 2번째부터 10개 바이트 출력하기

			String a;
			Scanner sc = new Scanner(System.in);
			a = sc.next();
			for (int i = 0; i < 10; i++) {

			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		}

		System.out.println("출력이 완료되었습니다.");

	} // end of main

}
