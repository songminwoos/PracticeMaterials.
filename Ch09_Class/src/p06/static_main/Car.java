package p06.static_main;

// main method가 있는 class도 결론은 class이다.
// - field, constructor, instance method, static method 존재함
// main method는 기본적으로 static method임
// - main method가 static method이기 때문에 instance field, instance method 사용 불가
// - static method인 main에서 instance field, instance method를 사용하고 싶으면, new로 인스턴스 생성하여 사용하면 됨
public class Car {
	int speed;
	String name;
	static String color;

	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public static void main(String[] args) {
		// static method에서는 static field, 다른 static method 사용 가능
		color = "red";
		printHello();

		// instance field, instnace method는 static method에서 사용 불가
//		speed = 0;
//		printInstanceHello();
		Car car = new Car();
		car.speed = 0;
		car.printInstanceHello();
		
	}

	public static void printHello() {
		System.out.println("Hello, static method");
	}
	
	public void printInstanceHello() {
		name = "Honggildong";
		System.out.println("Hello, instance method");
	}
}



