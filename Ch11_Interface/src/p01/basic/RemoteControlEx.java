package p01.basic;

// Interface 정의
// 1. 상수와 추상메소드들만 사용하는 것을 말함 (원칙)
//   - Abstract class : 상수, instance/static 변수, 생성자, instance/static method, abstract method(추상메소드)
//   - 특화된 추상클래스라고 간주해도 됨
//   - 2016년 Java 1.8에서 default method와 static method를 추가했음
// 2. Interface 문법
//   - 상수를 선언할 때 public static final 키워드를 사용하지 않아도 java가 나중에 public static final을 붙여줌
//   - method 선언 : 추상메소드를 선언, public abstract 키워드를 사용하지 않아도 java가 나중에 public abstract을 붙여줌
// 3. Polymorphism 사용이 기본
//   - 사용방법 : 인테페이스이름(부모) 변수 = 인터페이스구현클래스(자식) 인스턴스 => promotion (자동형변환)
//     예 : rc = new Audio();
// 4. class가 Interface 사용 방법
//   - class이름 implements Interface이름
//   - implements 다음에 여러개의 인터페이스가 올 수 있음
// 5. Interface에서 선언된 상수와 추상메소드는 public임
// 6. Interface는 기본적으로 부모 인스턴스를 힙메모리에 만들지는 않음 (?)
public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;
		
//		rc = new Television();	// 자동형변환(promotion) 부모클래스(인터페이스) 변수 = 자식클래스(Interface구현클래스)
		rc = new Audio();
		
		rc.turnOn();		// polymorphism = 자동형변환 + 자식클래스의 override method 실행
		rc.setVolume(7);
		rc.turnOff();
	}

}
