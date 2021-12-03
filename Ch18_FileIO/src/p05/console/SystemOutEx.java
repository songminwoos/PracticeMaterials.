package p05.console;

import java.io.IOException;
import java.io.OutputStream;

// System.err : 개발자가 컨솔창에 에러 메세지를 보여줄 떄 사용
// => eclipse에서 실행중에 에러메세지를 빨간 글씨로 보여줄 떄 System.err 사용
public class SystemOutEx {

	public static void main(String[] args) throws IOException{
		OutputStream os = System.out;
	
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
		os.write(10);

		for (byte b = 97; b <123; b++) {
			os.write(b);
		}
		os.write(10);
		
		String hangul = "가나다라마바사아자차카타하";
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes);
		
		os.flush();
		os.close();
		
		System.err.println("System err 사용");
	}

}
