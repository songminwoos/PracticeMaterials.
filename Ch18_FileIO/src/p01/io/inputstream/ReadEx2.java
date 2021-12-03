package p01.io.inputstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// read(readByte) => readByte 변수의 배열 크기의 최대만큼 읽어오기, return ㄱ밧은 실제 읽어온 바이트 갯수
// String(array, startIndex, readByteNo) => readByte 배열의 

public class ReadEx2 {

	public static void main(String[] args) throws IOException {
	      InputStream is = new FileInputStream("src/p01/io/inputstream/text.txt");
	      int readByteNo;
	      byte[] readByte = new byte[3];
	      String data = "";
	      
	      while (true) {
	    	  readByteNo = is.read(readByte);
	    	  if (readByteNo == -1) {
	    		  break;
	    	  }
	    	  data += new String(readByte, 0, readByteNo);
	    	  System.out.println("readByteNo : " + data);
	      }
	      is.close();	      
	}

}
