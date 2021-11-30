package p01.basic2;

// class 이름 : Circle (원을 class로 만든 것)
// 1. class에서 constructor method를 여러개 만들 수 있음
//    - 사용자 요청에 의해서 만들어 짐
// 2. 생성자의 대표적인 역할은 인스턴스마다 고유의 field값을 가질 수 있도록, Class내부에 선언된 field값 초기화
// 3. Circle class처럼 main method가 없는 class들의 역할은
//    - main method가 없는 class는 다른 main method가 없는 class에서 사용
//    - main method가 있는 class에서도 사용하기 위한 것임
//    - 다른 class에서 사용할 수 있는 library의 역할을 함 (주로 method 사용)
// 4. main method가 없는 class들을 일반적으로 Java library라고 부름
//    - Java에서 제공한 library : Scanner, System, ..
//    - JSP, Spring에서 제공한 class library
//    - Java 개발자가 만든 class library
public class Circle {
	double radius = 1;
	String name = "플레인피자";
	
	// constructor
	public Circle() {
	}
	
	// constructor
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	// constructor
	public Circle(String newName) {
		name = newName;
	}
	
	// constructor
	public Circle(double newRadius, String newName) {
		radius = newRadius;
		name = newName;
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















