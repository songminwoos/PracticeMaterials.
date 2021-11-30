package p10.abstract_class;

// 추상클래스 (Abstract class)
// 1. 추상클래스로 선언이 되면, 추상클래스를 new를 사용하여 인스턴스를 직접 만들 수 없음 
// 2. 추상클래스를 부모로 한 자식클래스를 new를 사용하여 인스턴스 만드는 것만 허용
// 3. 추상클래스 내부에 생성자는 있어야만 함
//    - 이유 : 추상클래스를 사용하여 직접 new로 인스턴스를 만들 수 없지만, 
//            자식 클래스를 통해 부모인 추상클래스의 생성자를 호출하기 때문임. 
public class SmartPhoneEx {

	public static void main(String[] args) {
//		Phone phone = new Phone();
		
		SmartPhone sp = new SmartPhone("홍길동");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	}

}
