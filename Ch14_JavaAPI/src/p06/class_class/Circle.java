package p06.class_class;

public class Circle {
	double radius = 1;
	String name = "플레인피자";
	
	public Circle() {
	}
	
	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public Circle(String newName) {
		name = newName;
	}
	
	public Circle(double newRadius, String newName) {
		radius = newRadius;
		name = newName;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	// 원의 반지름 값 변경하기
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}









