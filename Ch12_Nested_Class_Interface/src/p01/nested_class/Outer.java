package p01.nested_class;

// 1. instance 중첩 클래스
// - instance field, intance method 선언 가능
// - static field, static method 선언 불가
// 2. static 중첩 클래스
// - instance field, intance method, static field, static method 선언 가능 
// 3. local 중첩 클래스
// - instance field, intance method 선언 가능
// - static field, static method 선언 불가
// - 특정 메소드안에서 선언된 local 중첩 클래스는 특정 메소드안에서 new로 인스턴스 생성해서 사용해야만 함
public class Outer {

	public Outer() {
		System.out.println("Outer class 인스턴스 생성됨");
	}
	
	// 중첩클래스인 instance class 선언
	class Inner_Instance {
		int field1;
//		static int field2;
		
		public Inner_Instance() {
			System.out.println("Inner_Instance class 인스턴스 생성됨");
		}

		void method1() { }
//		static void method2() { }
	}

	// 중첩클래스인 static class 선언
	static class Inner_Static {
		int field1;
		static int field2;
		
		public Inner_Static() {
			System.out.println("Inner_Static class 인스턴스 생성됨");
		}
		void method1() { }
		static void method2() { }
		
	}
	
	void outer_method() {
		// 중첩클래스인 local class (method 안에서 선언된 class)
		class LocalClass {
			int field1;
//			static int field2;
			
			public LocalClass() {
				System.out.println("LocalClass class 인스턴스 생성됨");
			}
			
			void method1() { }
//			static void method2() { }
		}
		LocalClass l = new LocalClass();
		l.field1 = 3;
		l.method1();
	}
	
	
}








