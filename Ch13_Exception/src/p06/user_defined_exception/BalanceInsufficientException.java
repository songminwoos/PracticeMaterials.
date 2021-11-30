package p06.user_defined_exception;

// Exception의 자식 클래스로 user defined Exception 선언 가능
// 1. super(), super(message)등으로 Exception class의 constructor를 호출하면
//    Java에서 Exception처럼 동등하게 사용 가능 (예를 들면, console창에 빨간 글자의 에러 메세지 생성가능,..)
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {
		
	}
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
