package p02.compile_exception;
/*
 Class.forName 메소드를 사용할 경우에는
 compile time에 ClassNotFoundException에 대한 exception처리(try~ catch 명령어를 프로그래밍해야만 함)
 */
public class ClassNotFoundException {

	public static void main(String[] args) {
		//"Java.lang.String" 클래스를 cls에 저장해줘
//		Class cls = Class.forName("java.lang.String");
		try {
			Class cls = Class.forName("java.lang.String");
			System.out.println("클래스가 존재합니다.");
		} catch (java.lang.ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
		
	}

}
