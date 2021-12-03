package p02.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// write(data, startIndex, witeLength) :  

public class FileWrite2 {
	
	public static void main(String[] args)  throws IOException  {
		OutputStream os = new FileOutputStream("c:/tmp/test.txt");
		byte[] data = "ABCD".getBytes();
		
		os.write(data, 1, 2);
		
		os.flush();
		os.close();	
	}

}
