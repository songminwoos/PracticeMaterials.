package p08.default_method_abstract;
/*
 Interface에서 선언되 default method를 자식 Interface에서 사용 방법
 1. 부모 Interface에서 선언된 default method 단순 사용
 2. 부모 Interface에서 선언된 default method를 자식 Interface에서 Override하여 default method를 재정의
 3. 부모 Interface에서 선언된 default method를 자식 Interface에서 abstract(추상) method로 재정의하여 사용
 */
public class ChildInterfaceEx {

	public static void main(String[] args) {
		
		ChildInterface ci1 = new ChildInterface() {
			
			@Override
			public void method1() {
				System.out.println("method1 실행");
			}
			
			@Override
			public void method2() {
				System.out.println("method2 실행");
			}
			
			@Override
			public void method3() {
				System.out.println("method3 실행");
			}
			
		
		};
		ci1.method1();
		ci1.method2();
		ci1.method3();
	}

}
