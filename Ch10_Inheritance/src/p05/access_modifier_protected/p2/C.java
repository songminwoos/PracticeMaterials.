package p05.access_modifier_protected.p2;

import p05.access_modifier_protected.p1.A;

// C class는 다른 package의 A class를 상속관계없이 사용
// 1. A class에서 protected로 선언된 constructor, field, method는 사용 불가
public class C {

	public void method() {
//		A a = new A();
//		a.field = "new_value";
//		a.method();
	}
	
}
