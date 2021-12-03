package p08.filterstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws IOException {
		long start = 0;
		long end = 0;

		FileInputStream fis1 = new FileInputStream("c:/house.jpg");
		start = System.currentTimeMillis();
		while (fis1.read() != -1) {

		}
		end = System.currentTimeMillis();
		System.out.println("Buffered Input 사용하지 않았을 떄 : " + (end - start) + "ms");
		fis1.close();
		
		FileInputStream fis2 = new FileInputStream("c:/house.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while (bis.read() != -1) {
			
		}
		end = System.currentTimeMillis();
		System.out.println("Buffered Input 사용했을 떄 : " + (end - start) + "ms");		
		bis.close();
		fis2.close();
	}

}
