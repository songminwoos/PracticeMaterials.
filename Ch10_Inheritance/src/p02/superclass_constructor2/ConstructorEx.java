package p02.superclass_constructor2;

// 상속 생성자(constructor) 호출 순서
// 1. JVM에서 heap memory에 부모 인스턴스를 생성
// 2. JVM에서 heap memory에 자식 인스턴스를 생성
// 3. 부모 class인 Parent class의 기본 constructor를 자동 호출
// 4. 자식 class인 Child class의 Child(int homePhoneNumber) constructor를 호출
public class ConstructorEx {

	public static void main(String[] args) {
		Child c = new Child(21);

	}

}
