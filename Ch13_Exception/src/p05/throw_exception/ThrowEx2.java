package p05.throw_exception;

// main method에서 throw Exception클래스이름 으로 사용한 경우
//    예 : main(String[] args) throws ClassNotFoundException
// - JVM이 main에서 넘긴 Exception을 실행함
// - 절대로 main메소드에서 throws 사용하면 안됨
public class ThrowEx2 {

	public static void main(String[] args) throws ClassNotFoundException {

		findClass();
		
		System.out.println("정상 처리됨");
		
	}

	public static void findClass() throws ClassNotFoundException {
		
		Class cls = Class.forName("java.lang.String2");
		
	}
}
