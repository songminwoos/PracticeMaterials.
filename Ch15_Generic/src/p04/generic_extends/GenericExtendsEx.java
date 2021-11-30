package p04.generic_extends;

public class GenericExtendsEx {

	public static void main(String[] args) {
		// compare의 parameter의 class type이 자식 class만 허용하기 떄문에 String class는 사용 불가
//		String str = Util.compare("a", "b");
		
		// 10 => Integer class type 으로 auto boxing
		int result = Util.compare(10, 20);
		System.out.println(result);

		// 4.5 => Double class type 으로 auto boxing
		result = Util.compare(4.5, 3);
		System.out.println(result);

	}

}
