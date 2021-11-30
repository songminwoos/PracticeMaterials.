package p01.basic;

// 자식 class에서 사용하는 메소드, 필드 선언
public class Student extends Person {
	String ssn = "123456";
	
	void study() {
		System.out.println(name + "는 공부합니다.");
	}
}
