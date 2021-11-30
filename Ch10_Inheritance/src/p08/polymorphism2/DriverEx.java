package p08.polymorphism2;

// polymorphism의 사용 목적
// 1. Android, Spring처럼 library들을 부모class로 제공하고, 
//    개발자가 개발할 경우 자식 클래스를 만들고, 부모 클래스의 특정 메소드를 override하여 사용하기 위한 목적
// 2. old한 자식클래스를 부품처럼 new 자식 클래스로 교체하여 사용할 경우
//    - new 자식 클래스로 교체하여 사용하더라도, 기존의 소스코드 수정량이 매우 적음
public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
//		Bus bus = new Bus();
//		Taxi taxi = new Taxi();
		Sedan sedan = new Sedan();
		
		Vehicle v;

//		v = bus;	// 자동형변환(promotion)
//		v = taxi;
		v = sedan;
		driver.drive(v);
//		driver.drive(taxi);
	}

}
