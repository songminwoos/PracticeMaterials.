package p05.access_modifier_protected.p1;

// A class에서 protected로 선언된 constructor, field, method는 
// 같은 package에 있는 B class에서 당연히 사용 가능함
public class B {

	public void method() {
		A a = new A();
		a.field = "new_value";
		a.method();
	}
}
