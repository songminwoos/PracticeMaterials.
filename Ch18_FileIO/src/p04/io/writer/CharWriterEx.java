package p04.io.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharWriterEx {

	public static void main(String[] args) throws IOException {
		Writer w = new FileWriter("C:/tmp/test.txt");
		char[] c = "홍길동".toCharArray();

		for (int i = 0; i < c.length; i++) {
			w.write(c[i]);
		}
		w.flush();
		w.close();

	}
	
}
