package p02.this_usage2;

// class 이름 : Circle (원을 class로 만든 것)
// 1. class에서 field이름을 읽어오거나, 수정할 때 'this.'을 붙여서 사용할 것
//    => filed에서 사용되는 this는 heap memory에 생성된 인스턴스
public class Circle {
	double radius;
	String name;
	
	// constructor
	public Circle() {
		this("플레인피자", 10);
	}
	
	// constructor
	public Circle(double newRadius) {
		this("플레인피자", newRadius);
	}
	
	public Circle(String newName, double newRadius) {
		this.name = newName;
		this.radius = newRadius;
	}
	
	// 원의 면적
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
	
	// 원의 둘레 계산
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	// 원의 반지름 값 변경하기
	public void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	
	public void printCircleInformation() {
		System.out.println("피자이름 = " + this.name + ", 반지름 " + this.radius + ", "
				+ ", 피자 면적 = " + getArea() + ", 피자 둘레 = " + getPerimeter() );
	}
}















