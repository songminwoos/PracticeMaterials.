package p03.anonymous_class;

// 익명객체를 만들 때
// 1. 부모Class를 자식인스턴스인 익명객체로 만드는 경우
public class AnonyClass {
	// Person field = new PersonChild();
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				walk();
			}
		};
//		localVar.walk();
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}










