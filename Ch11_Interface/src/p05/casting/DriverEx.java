package p05.casting;

// 1. 부모인 Interface에 자식 클래스를 할당하면 자식클래스에서 선언된 메소드는 사용 못함
// - 예를 들면, Vehicle vehicle = new Bus(); 사용하면, 
//            vehicle은 Vehicle interface에서 선언한 추상메소드를 자식클래스인 Bus에서 override한 메소드만 사용가능
// 2. 자식클래스에 있는 메소드를 사용하기 위해서는 casting(강제형변환) 해야 함
public class DriverEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();	// Bus를 부모인 Vehicle Interface로 자동형변환(promotion)

		vehicle.run();
		
//		vehicle.checkFare();
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle; 
			bus.checkFare();
		}
	}

}
