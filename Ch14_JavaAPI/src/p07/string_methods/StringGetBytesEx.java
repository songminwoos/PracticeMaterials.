package p07.string_methods;

import java.io.UnsupportedEncodingException;

// [문자열 인코딩(encoding) 및 디코딩(decoding)]
// 1. encoding : 특정 문자set 코드로 변환 (string => bytes)
//    - java에서 encoding하는 방법 예 : str.getBytes(), str.getBytes("EUC-KR"), getBytes("UTF-8")
// 2. decoding : 특정 문자set 코드로 되어 있는 것을 해독하여 원래 문자열로 변환
//    - java에서 decoding하는 방법 예 : new String(b1), new String(b2, "EUC-KR"), new String(b3, "UTF-8")
// 3. 문자열 set 예 : EUC-KR(한글 1글자를 2bytes로 encoding), UTF-8(한글 1글자를 3bytes로 encoding)
// 4. 현재 세계 표준 문자 set : utf-8
// 5. 인코딩/디코딩이 나온 원래 이유 : 통신망을 통해 데이터를 주고 받을 때 사용, 
//    데이터를 통신선을 통해 보낼 때는 byte단위로 encoding하여 전송하고, 데이터를 받는 쪽은 encoding된 데이터를 다시
//    디코딩하여 사용
public class StringGetBytesEx {

	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] b1 = str.getBytes();	// 시스템에서 설정한 default(기본) 문자 set, utf-8로 설정했음
		System.out.println("b1 length = " + b1.length);
		String s1 = new String(b1);
		System.out.println(s1);

		try {
			byte[] b2 = str.getBytes("EUC-KR");
			System.out.println("b2 length = " + b2.length);
			String s2 = new String(b2, "EUC-KR");
			System.out.println(s2);
			
			byte[] b3 = str.getBytes("UTF-8");
			System.out.println("b3 length = " + b3.length);
			String s3 = new String(b3, "UTF-8");
			System.out.println(s3);
		} catch (UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException 발생");			
		}
	}

}
