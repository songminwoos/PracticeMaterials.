package p02.superclass_constructor2;

public class Child extends Parent {

	public Child() {
		System.out.println("Child - 기본 constructor 호출");
	}
	
	public Child(int homePhoneNumber) {
		System.out.println("Child - Child(int homePhoneNumber) constructor 호출");
	}

}
