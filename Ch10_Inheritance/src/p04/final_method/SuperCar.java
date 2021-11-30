package p04.final_method;

// 부모 클래스의 특정 method를 final로 선언하면, 자식 클래스에서 override하여 사용 불가
public class SuperCar extends Car {

	@Override
	public void speedUp() {
		speed = speed + 10;
	}

//	@Override
//	public void stop() {
//		System.out.println("스포츠카를 멈춤");
//		speed = 0;
//	}
	
}
