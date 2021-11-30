package p08.default_method_abstract;

public interface ParentInterface {
	
	public void method1();
	// child method를 자식 method에서 추상메소드로 선언했기에 실행안됨
	public default void method2() {
		System.out.println("ParentInterface - default method2 실행");
		
		
	}

}
