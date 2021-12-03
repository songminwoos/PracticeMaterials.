package p03.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharReaderEx2 {

	public static void main(String[] args) {
		Reader r = null;
		
		
		try {
			r = new FileReader("c:/tmp/test.txt");
			int readCharNo;
			char[] cbuf = new char[2];
			String data = "";
			while (true) {
				readCharNo = r.read(cbuf);
				if (readCharNo == -1) {
					break;
				}
				data += new String(cbuf, 0, readCharNo);
				System.out.println(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				r.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
