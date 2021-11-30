package p02.this_usage;

// class 이름 : Circle (원을 class로 만든 것)
// 1. Constructor사용시 this의 의미
// - Constructor 메소드에서 다른 constructor 메소드 호출 가능
// - this("플레인피자", 10); 는 Circle(String newName, double newRadius) 생성자를 호출
//     => this의 의미는 heap memory에 있는 인스턴스 주소를 갖고 있음
//     => this의 주소는 고정된 것이 아니라, new로 인스턴스가 생성될 때 마다 new로 생성된 인스턴스의 주소를 갖고 있음
// 2. heap memory에 생성된 인스턴스는 field 변수들만 갖고 있음 (method, constructor는 소스코드로 별도 갖고 있음)  
public class Circle {
	double radius;
	String name;
	
	// constructor
	public Circle() {
//		name = "플레인피자";
//		radius = 10;
		this("플레인피자", 10);
		System.out.println("Circle() this = " + System.identityHashCode(this));
	}
	
	// constructor
	public Circle(double newRadius) {
//		name = "플레인피자";
//		radius = newRadius;
		this("플레인피자", newRadius);
		System.out.println("Circle(double newRadius) this = " + System.identityHashCode(this));
	}
	
	public Circle(String newName, double newRadius) {
//		System.out.println("Circle(String newName, double newRadius) 호출함");
		name = newName;
		radius = newRadius;
		System.out.println("Circle(String newName, double newRadius) this = " + System.identityHashCode(this));
	}
	
	// 원의 면적
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// 원의 둘레 계산
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	// 원의 반지름 값 변경하기
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public void printCircleInformation() {
		System.out.println("피자이름 = " + name + ", 반지름 " + radius + ", "
				+ ", 피자 면적 = " + getArea() + ", 피자 둘레 = " + getPerimeter() );
	}
}















