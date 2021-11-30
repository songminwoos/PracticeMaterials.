package p05.access_modifier_protected.p2;

import p05.access_modifier_protected.p1.A;

// D는 A의 자식클래스로 사용
// 1. 부모 클래스인 A의 protected로 선언된 field, method는 자식 class에서 사용 가능
// 2. 부모 클래스인 A의 protected로 선언된 constructor도 자식 class에서 사용 가능
//    - 단, new A() 와 같이 new로 새로운 인스턴스를 생성할 수 없도록 java에서 막았음
// 3. 자식클래스에서 부모클래스에서 protected로 선언된 field, method만 사용할 수 있게 해줌
public class D extends A {
//	A a = new A();
	
	public D() {
		super();
		this.field = "new_value";
		this.method();
	}

	
	public void method() {
//		A a = new A();
		
	}
}
