package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) {

		long millisecond = 0;

		try (FileInputStream fis = new FileInputStream("chapter02.zip")) {
			FileOutputStream fos = new FileOutputStream("copy.zip");
			// ������Ʈ�� ����غ���
			// ��ǲ ��Ʈ�� => ����
			BufferedInputStream bis = new BufferedInputStream(fis);

			// �ƿ�ǲ ��Ʈ�� -> ����
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			millisecond = System.currentTimeMillis();
			int i;

			// ��� ��Ʈ�� ��� �ڵ�
//			while ((i = fis.read()) != -1) {
//				fos.write(i);
//			}

			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis() - millisecond;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("������ �����ϴµ� " + millisecond + " �ҿ�Ǿ����ϴ�.");

	}

}
