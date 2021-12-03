package p02.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// FileOutputStream
// 1. FIle을 새로 생성할 파일 이름을 지정 가능 (단,  파일이 생성될 디덱토리는 존재해야 함, 디덱토리 없으면 Exception 발생)
// 2. write() : file에 실제로 byte 단위로 write 수행
// 3. flush() : 출력 버퍼에 있는 문자들 전체를 한번에 file에 write
// 4. 디렉토리에 write할 파일명과 동일한 파일이 존재하면, 기존 파일에 있던 데이터는 전부 소실되고,
//    파일에는 새로운 데이터만 write됨
public class FileWriteEx1 {

	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/tmp/test.txt");
		byte[] data = "XYZ".getBytes();

		for (int i = 0; i < data.length; i++) {
			os.write(data[i]);    // 풀력 버퍼에 바이트 단위로 write
		}
		os.flush(); 				 // 출력 버퍼에 있는 문자들 전체를 한번에 file에 write
		os.close();
	}

}
