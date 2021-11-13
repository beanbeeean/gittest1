package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {

		try (FileWriter fw = new FileWriter("writer.txt", false)) {

			fw.write('a');
			char buf[] = { 'B', 'U', 'F', 'F', 'E', 'R', 'E', 'D' };
			fw.write(buf);
			fw.write(buf, 1, 5);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}