package p08.polymorphism2;

public class Driver {

	// parameter가 자식인 Bus, Taxi의 인스턴스를 사용 가능
	// parameter에서 자동형변환 발생 (vehicle = bus 또는 vehicle = taxi)
	public void drive(Vehicle vehicle) {
		vehicle.run();	//run() 메소드를 실행할 때 polymorphism에 의해 Bus, Taxi 클래스의 override된 메소드를 실행
	}
}
