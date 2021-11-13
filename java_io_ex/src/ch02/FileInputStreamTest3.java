package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		
//		try {
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		
		
		// �ڹ� JDK 9 ���� ���ĺ��� ��� ����
		try(FileInputStream fis = new FileInputStream("assets/input.txt")){
			
			int i;
			while( (i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("������ �����ϴ�.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
