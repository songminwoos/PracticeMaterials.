package p10.singleton_usage;

// class constructor(생성자)를 private으로 선언
// - method의 일종인 constructor method도 private으로 선언 가능
// - 생성자 method를 private으로 선언하면, 다른 class에서 인스턴스 생성 불가
// 특이사항 : class내에서 field를 선언할 때 본인 class이름으로 instance 생성 가능
// Singleton 단어 의미 : instance를 class내에서 한번만 생성하고, 다른 class에서는 new로 인스턴스 새로 만들 필요 없이
//                     생성된 인스턴스를 사용하게 함
public class Singleton {
//	int a=10;
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
		
	}

	public static Singleton getInstance() {
		return singleton;
	}
	
	public void printHello() {
		System.out.println(System.identityHashCode(singleton));
		System.out.println("Hello, instance method");
	}
}
