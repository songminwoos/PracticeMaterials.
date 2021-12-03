package p08.filterstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader(InputStream is) 
// => inputStream을 parameter로 받아서 byte 단위로 읽은 입력 데이터를 char단위로 변환하는 class  
public class InputStreamReaderEx {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		
		int readCharNo;
		char[] cbuf = new char[100];
		while ( (readCharNo = reader.read(cbuf)) != -1 ) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		
		reader.close();
	}

}
