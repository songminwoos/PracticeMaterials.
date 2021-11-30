package p07.string_methods;

import java.io.IOException;

// 1. System.in.read(bytes) 
//    => 키보드에서 byte[] 배열로 문자들을 읽어 bytes변수에 집어 넣어줌
//    => read의 return값으로 읽어들인 총 byte갯수를 넘겨줌 (readByteNo에 읽어들인 총 바이트 수가 저장이 됨)
//    => bytes에는 입력한 문자와 enter key에 해당하는 문자까지 포함
//       (enter key를 1번 입력하면 2개의 byte가 생성됨 => \r, \n)
//    => 예를 들어 키보드로 Hello + enter key => Hello\r\n (총 7개 bytes 생성됨)
public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(bytes);
		System.out.println("readByteNo = " + readByteNo);

		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
