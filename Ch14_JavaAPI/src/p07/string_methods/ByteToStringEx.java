package p07.string_methods;

public class ByteToStringEx {

	public static void main(String[] args) {
		// 숫자가 ASCII code값 (예 : 72는 'H')
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};

		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

}
