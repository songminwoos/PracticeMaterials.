package p05.throw_exception;

// Exception 처리 방법
// 1. Exception이 발생한 곳에서 try~catch~finally를 사용하는 방법
// 2. Exception이 발생한 메소드를 호출하는 상위 메소드에서 처리하도록 하는 방법 (throw Exception클래스이름)
//    예 : Exception이 발생한 findClass() 메소드에서 throws ClassNotFoundException를 선언
//   - 상위 메소드에서 모든 종류의 exception들을 한번에 처리할 경우에 사용함
public class ThrowEx {

	public static void main(String[] args) {

		// main method에서 모든 exception 처리
		try {
			findClass();
			System.out.println("정상 처리됨");
		} catch (ClassNotFoundException e) {
			System.out.println("compile-time exception 처리");
		}
		
	}

	public static void findClass() throws ClassNotFoundException {
		
		Class cls = Class.forName("java.lang.String2");
		
	}
}
