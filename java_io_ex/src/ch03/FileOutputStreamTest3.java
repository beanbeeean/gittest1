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
//			fos.write(bs, 2, 10); // �迭 2��°���� 10�� ����Ʈ ����ϱ�

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

		System.out.println("����� �Ϸ�Ǿ����ϴ�.");

	} // end of main

}
