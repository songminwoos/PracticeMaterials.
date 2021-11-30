package p01.basic;

// class 이름 : Circle (원을 class로 만든 것)
// 1. class 속성(field) : radius
// 2. class 생성자(constructor) : Circle(), Circle(double newRadius)
//    => 생성자의 이름과 class의 이름은 동일함
//    => 생성자의 method 임. 생성자는 오직 1번만 실행할 수 있음. 
//       . new Circle() 같은 방식으로 heap memory에 Circle class의 객체를 생성하면서 1번만 실행되는 method
// 3. class method : getArea(), getPerimeter(), setRadius(double newRadius)
// 4. 생성자(constructor) overloading : method의 overloading과 동일한 개념
public class Circle {
	double radius = 1;
	
	// constructor
	public Circle() {
		System.out.println("Circle 생성자 호출하였습니다.");
	}
	
	// constructor
	public Circle(double newRadius) {
		System.out.println("Circle(double newRadius) 생성자 호출하였습니다.");
		radius = newRadius;
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
}















