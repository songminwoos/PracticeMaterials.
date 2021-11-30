package p03.generic_method;

// generic method 사용 문법
// <T> return type method이름(parameter,,...)
//  => <T> Box<T> boxing(T t)
public class GenericMethodEx {
	public static void main(String[] args) {
		Box<Integer> b1 = Util.<Integer>boxing(100);
//		Box<Integer> b1 = Util.boxing(100);
		int i1 = b1.get();
		
		Box<String> s1 = Util.<String>boxing("홍길동");
		String name = s1.get();
	}
	
}
