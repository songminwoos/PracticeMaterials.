package p07.default_method_use;

// 기존 고객대상으로 만들어 사용하고 있는 자식클래스
public class MyClassA implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassA - method1() 실행");
	}

}
