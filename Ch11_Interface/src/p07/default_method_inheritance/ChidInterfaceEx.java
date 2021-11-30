package p07.default_method_inheritance;

// 1. default method를 단순히 상속받아서 사용하는 경우
public class ChidInterfaceEx {

	public static void main(String[] args) {
		ChildInterface ci1 = new ChildInterface() {
			
			@Override
			public void method1() {
				System.out.println("method1 실행");
			}
//			@Override
//			public void method2() {
//				System.out.println("method1 실행");
//			}
			@Override
			public void method3() {
				System.out.println("method1 실행");
			}
		};

		ci1.method1();
		ci1.method2();
		ci1.method3();
	}

}
