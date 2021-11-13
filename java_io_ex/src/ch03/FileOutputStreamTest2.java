package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		
		try(fos){
			
			byte[] bs = new byte[26];
			byte data = 65; // 'A'  의 아스키 코드값
			
			// A - Z
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			
			fos.write(bs); // 배열안에 있는 데이터를 화면에 출력하기
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}

	}

}
