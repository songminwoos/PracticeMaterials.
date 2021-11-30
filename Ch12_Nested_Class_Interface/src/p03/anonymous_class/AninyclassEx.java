package p03.anonymous_class;

public class AninyclassEx {

	public static void main(String[] args) {
		AnonyClass ac =new AnonyClass();
		
		ac.field.wake();
		ac.method1();
		//자식 익명객체를 method2의 parameter로 넘김
		ac.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			@Override
			void wake() {
				System.out.println("9시에 일어납니다.");
				study();
			}
		});
	}

}
