package p03.io.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

// FileReader : 1 문자((영문자, 한글 모두 포함) 단위로 파일에서 데이터를 읽어옴
// close() 메소드 : File read, write 상관없이 마지막에 close()메소드를 사용할 것을 권장
// => FileOpen할 때, 힙 메모리에 많은 크기의 메모리를 차지하는데, close()를 사용하면 힙메모리에서 즉시 제거함

public class CharReaderEx {

	public static void main(String[] args) {
		Reader r = null;
		
		try {
			r = new FileReader("c:/tmp/test.txt");
			int readData;
			while (true) {
			
				readData = r.read();
				if (readData == -1) {
					break;
				}
				System.out.println((char) readData);
			}			
		} catch (FileNotFoundException  ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				r.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
