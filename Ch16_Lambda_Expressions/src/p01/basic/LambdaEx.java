package p01.basic;

// Lambda expression 정의
// 1. Interface의 추상메소드에 대하여 사용 가능
// 2. Interface의 추상메소드가 1개가 있을 경우에만 적용됨
// 3. 람다표현식으로 생성된 인스턴스는 내부적으로 익명객체로 생성됨
// Lambda expression (람다 표기법) 예
//    () -> {System.out.println("Hello Lambda function");};
//    => sayHello method 구현한 내용 
//          1) () => sayHello() method의 parameter를 표현
//          2) -> {System.out.println("Hello Lambda function");}; => sayHello method의 body를 coding한 것
public class LambdaEx {

	public static void main(String[] args) {
		MyInterfaceImpl mi = new MyInterfaceImpl();
		mi.sayHello();
		
		// 인터페이스를 익명객체로 생성하여 사용
		MyInterface ma = new MyInterface() {
			@Override
			public void sayHello() {
				System.out.println("Hello MyInterface anonymous Instance");
			}
		};
		ma.sayHello();

		// Lambda expression (람다 표기법)
		MyInterface ml = () -> {System.out.println("Hello Lambda function");};
		ml.sayHello();
	}	
}
