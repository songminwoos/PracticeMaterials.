package p12.access_modifier.package2;

import p12.access_modifier.package1.A;


// 1. default : package내에서만 사용 가능
//    - 사용을 권장함. (한개의 package안에 있는 class들은 서로 연관 관계가 높아, 사용 빈도수가 높음)
// 2. public : 다른 package안에서도 사용 가능
//      - 사용할 때 조심해야 함. 꼭 필요한 경우에만 field, method, 생성자들을 public으로 선언할 것
public class C {
//	A a1 = new A();		// default로 선언된 생성자는 다른 package의 class에서 사용 불가
	A a2 = new A(1);	// public으로 선언된 생성자는 다른 package의 class에서도 사용 가능
//	A a3 = new A(1.0);	//같은 package라도 private으로 선언된 생성자는 다른 class에서 사용 불가
	
	// public default 생성자
	public C() {
//		a2.a = 1;		// default로 선언된 field는 다른 package의 class에서 사용 불가
		a2.b = 2;		// public으로 선언된 field만 사용 가능
//		a2.c = 3;
		
//		a2.printDefault(); // default로 선언된 method는 다른 package의 class에서 사용 불가
		a2.printPublic();	// public으로 선언된 method만 사용 가능
//		a2.printPrivate();
	}

}
