package p04.anonymous_interface;

// 2. 익명객체 만들 때 부모 Interface를 이용하는 예제
public class AnonyInterface {
	// 1. AnonyInterface class의 field에 RemoteControl interface의 자식인스턴스(익명객체 형식) 생성
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};

	void method1() {
		// 2. method1의 field에 RemoteControl interface의 자식인스턴스(익명객체 형식) 생성
		RemoteControl localVar = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");
			}	
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
			}
		};
		localVar.turnOn();
	}
	// 3. method2의 parameter에 RemoteControl interface의 자식인스턴스(익명객체 형식)를 넘김
	void method2(RemoteControl rc) {
		rc.turnOn();
	}
}


















