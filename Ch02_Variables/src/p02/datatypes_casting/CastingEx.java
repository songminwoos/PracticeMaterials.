package p02.datatypes_casting;

public class CastingEx {

	public static void main(String[] args) {
		char ch = 'A';	
		int number = 88;
		
		System.out.println("ch = " + ch);
		System.out.println("number = " + number);

		// 자동형변환 불가 (4bytes int type에서 2bytes char type으로 값을 옮기는 것은 데이터 값이 유실되서 문제 발생하기 때문)
		// (type) => 예로, (char) 가 있음.  4 bytes int type값을 2 bytes char type으로 변경해줘...
		// => casting (강제형변환)
		ch = (char) number;
		System.out.println("ch = " + ch);
	}

}
