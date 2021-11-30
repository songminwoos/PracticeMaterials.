package p05.access_modifier_protected.p1;

// protected 정의 
// 1. default access modifier와 같이 같은 package내에 있는 다른 class에서 사용 가능
// 2. 다른 package의 class를 부모 클래스로 사용할 경우에도 사용 가능함
// 3. 다른 package의 class와 상속으로 연결되어 있지 않은 경우는 사용 못함 
public class A {
	protected String field;
	
	protected A() {
		
	}
	
	protected void method() {
		System.out.println("A class method");
	}
}
