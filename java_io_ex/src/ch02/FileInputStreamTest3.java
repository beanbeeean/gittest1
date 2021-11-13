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
		
		
		// 자바 JDK 9 버전 이후부터 사용 가능
		try(FileInputStream fis = new FileInputStream("assets/input.txt")){
			
			int i;
			while( (i = fis.read()) != -1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
