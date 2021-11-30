package p02.superclass_constructor2;

// 1. 부모 클래스에서 기본 생성자를 없애면 안됨, 반드시 있어야 함
//    - 이유 : 자식클래스를 이용하여 new 자식클래스()로 자식인스턴스를 만들 때, 
//            기본적으로 부모클래스의 기본생성자 메소드를 자동으로 호출하도록 만들어져 있기 때문
public class Parent {
	int homePhoneNumber;
	
	// 기본 생성자 (default constructor)
	public Parent() {
		System.out.println("Parent - 기본 constructor 호출");
	}
	
	public Parent(int homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
		System.out.println("Parent - Parent(int homePhoneNumber) constructor 호출");
	}
}


