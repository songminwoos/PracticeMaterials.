package p07.default_method_use;

public interface MyInterface {

	public void method1();
	
	// 인터페이스에서 새로운 추상메소드를 만드는 대신 default 메소드를 추가
	public default void method2() {
		System.out.println("MyInterface - default method 실행");
	}
	
}
