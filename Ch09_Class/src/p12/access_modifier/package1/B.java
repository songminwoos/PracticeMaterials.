package p12.access_modifier.package1;

public class B {
	A a1 = new A();
	A a2 = new A(1);
//	A a3 = new A(1.0);	//같은 package라도 private으로 선언된 생성자는 다른 class에서 사용 불가
	
	// public default 생성자
	public B() {
		a1.a = 1;
		a1.b = 2;
//		a1.c = 3;
		
		a1.printDefault();
		a1.printPublic();
//		a1.printPrivate();
	}

}
