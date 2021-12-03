package p05.console;

import java.io.IOException;
import java.io.InputStream;

// namBytes-2 의미 : CR LF 2개 바이트를 제거 (enter key)

public class SystemInEx2 {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;

		byte[] datas = new byte[100];

		System.out.print("이름: ");
		int nameBytes = is.read(datas);
		String name = new String(datas, 0, nameBytes - 2);

		System.out.print("하고싶은말: ");
		int commentBytes = is.read(datas);
		String comment = new String(datas, 0, commentBytes - 2);

		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고 싶은말:" + comment);

	}

}
