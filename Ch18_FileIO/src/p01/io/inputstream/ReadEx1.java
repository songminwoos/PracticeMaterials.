package p01.io.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

// 1. File 데이터 읽기, 쓰기할 때는 반드시 Exception 코딩해야만 함 (try~catch, throws)
// 2. File 이름 지정 방법 : 기본적으로 디렉토리등 path 정보와 파일 이름이 합쳐진 개념임 
//   - 절대경로 : 하드디스크의 실제 파일이 존재하는 위치 
//     (예: E:\DevSpace\JavaSpace\Ch18_FileIO\src\p01\io\inputstream\test.txt) : MS-Window표기법
//     (예: E:/DevSpace/JavaSpace/Ch18_FileIO/src/p01/io/inputstream/test.txt) : UNIX/Linux표기법
//   - 상대경로 : eclipse등 java 개발툴(IDE)마다 차이가 있음
//     (eclipse 예 : ctrl+shift+r key를 누르면 상대위치 확인)
// 3. read(); : 1byte의 데이터를 읽어옴, return -1인 경우는 file에서 더 이상 읽은 데이터가 없다라는 의미
public class ReadEx1 {

   public static void main(String[] args) throws IOException {
//      InputStream is = new FileInputStream("E:\\DevSpace\\JavaSpace\\Ch18_FileIO\\src\\p01\\io\\inputstream\\text.txt");
//      InputStream is = new FileInputStream("E:/DevSpace/JavaSpace/Ch18_FileIO/src/p01/io/inputstream/text.txt");
      InputStream is = new FileInputStream("src/p01/io/inputstream/text.txt");
      int readByte;
      
      while(true) {
         readByte = is.read();
         if (readByte == -1) {
            break;
         }
         System.out.println("readbyte : " + (char) readByte);
      }
   }

}