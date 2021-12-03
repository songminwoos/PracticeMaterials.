package p07.file_practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("src/p07/file_practice/FileInputStreamEx.java");
		
		int data;
		while ( (data = fis.read()) != -1 ) {
			System.out.print((char) data);			
		}
		fis.close();
	}

}
