package p10.singleton_usage;

public class SingletonEx {

	public static void main(String[] args) {
		// Singleton class의 생성자를 private으로 했기 때문에 new로 인스턴스 생성 불가
//		Singleton s1 = new Singleton();
		// singleton field가 private으로 선언되어 있어서 static으로 선언되어 있어도 다른 class에서 사용 불가
//		System.out.println(Singleton.singleton);
		
		// Singleton class의 생성자를 private으로 선언했기 때문에, 다른 class에서 사용할 때는 new로 사용 불가
		// => 유일하게 사용할 수 있는 방법은 Singleton class이름으로 static field나 static method로 사용 가능
		// => singleton field를 private으로 선언했기 때문에, 유일하게 사용가능한 방법은 static method만 존재함
		Singleton s = Singleton.getInstance();
		s.printHello();
		
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		
		if (s == s1) {
			System.out.println("같은 싱글톤 인스턴스입니다.");
		} else {
			System.out.println("다른 싱글톤 인스턴스입니다.");
		}
		
	}

}
