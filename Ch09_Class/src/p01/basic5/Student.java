package p01.basic5;

// 1. field 초기화
//    => class field 이름만 선언하고 초기값을 주지 않은 상태에서
//       new Student(); 를 사용하여 heap memory에 인스턴스를 생성하면
// JVM이 모든 field를 자동 초기화 시켜줌
// - int, short, byte, char, long는 0으로 초기화
// - boolean은 false로 초기화
// - float, double은 0.0으로 초기화
// - String, 배열 등 참조객체 type은 null로 초기화
// 2. 모든 class는 생성자가 최소 1개가 있어야 함
//   - 만약 class에서 생성자가 선언이 안되어 있다면, JVM이 default 생성자를 자동으로 만들어줌
//   - class에서 default 생성자가 아닌 다른 생성자가 만들어지면, JVM이 default 생성자 자동으로 만들어 주지 않음
public class Student {
	String name;
	int age;
	boolean isComputerMajor;
	char gender;

	// default constructor
	public Student() {
		
	}
	
//	public Student(String newName) {
//		name = newName;
//	}
	
}








