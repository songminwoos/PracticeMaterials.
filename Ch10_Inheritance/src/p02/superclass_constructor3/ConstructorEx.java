package p02.superclass_constructor3;

// super() method
// 1. 부모 생성자 호출 method
//    - 본인 생성자 호출할 때 this(int x, int y); 방식으로 사용했듯이
//      부모 생성자 호출할 때도 super(x); 방식으로 호출 가능
// 2. this : 본인 인스턴스를 의미, super : 부모 인스턴스를 의미
// 3. 자식 생성자에서 부모 생성자를 super();로 부를 때, super();의 위치는 자식생성자 첫번째 line에 무조건 위치해야 함.
// 4. 자식 클래스에서 부모 클래스의 field, method를 사용할 때, super. 을 이용하여 사용 가능
//    본인 클래스의 field를 사용할 때, this. 을 이용
public class ConstructorEx {

	public static void main(String[] args) {
		Child c = new Child(21);

		System.out.println("집전화번호 = " + c.homePhoneNumber);
		
		c.printParentInformation();
	}

}
