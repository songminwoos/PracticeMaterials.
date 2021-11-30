package p08.pass_object;

// class 이름 : Circle (원을 class로 만든 것)
public class Circle {
	private double radius;
	private static int numberOfObjects = 0;		// new로 생성된 인스턴스 갯수를 관리하기 위한 목적
	public int a;
	
	// constructor
	public Circle() {
		radius = 1;
		numberOfObjects++;
	}
	
	// constructor
	public Circle(double newRadius) {
		this.radius = newRadius;
		numberOfObjects++;
	}

	// getter : field의 값을 읽어 오는 method를 말함
	//          method 앞에 반드시 public으로 선언해줌
	public double getRadius() {
		return radius;
	}

	// setter : field의 값을 변경하는 method를 말함
	//          => 입력값이 valid한지 check 가능
	public void setRadius(double radius) {
		if (radius >=0) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	}

	// getter method
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	// 원의 면적
	public double getArea() {
//		printHello();
		return this.radius*this.radius*Math.PI;
	}
	
	// method를 private으로 선언
	private void printHello() {
		System.out.println("Hello");
	}
	
}















