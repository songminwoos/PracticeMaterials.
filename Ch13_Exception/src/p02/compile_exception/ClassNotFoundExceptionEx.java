package p02.compile_exception;

import java.lang.ClassNotFoundException;
// Class.forName 메소드를 사용할 경우에는
// compile time에 ClassNotFoundException에 대한 exception처리(try ~ catch 명령어를 프로그래밍해야만 함)
public class ClassNotFoundExceptionEx {

	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("java.lang.String2");
			System.out.println("클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}
}
