package p06.static_variable;

public class TestCircleWithStaticfields {

	public static void main(String[] args) {
		System.out.println("new로 인스턴스 생성 전에 circle 인스턴스의 갯수 = " + Circle.numberOfObjects);
		
		Circle c1 = new Circle(); 		// c1 인스턴스 생성
		System.out.println("new로 c1인스턴스 생성 후에 circle 인스턴스의 갯수 = " + c1.numberOfObjects);
		
		Circle c2 = new Circle(5);
		
		c1.radius = 9;
		
//		c1.numberOfObjects = 10;		// static으로 선언된 field값을 변경하면 모든 인스턴스에서 변경된 값으로 보임
		System.out.println("new로 c2인스턴스 생성 하고 c1인스턴스 속성값 수정 후");
		System.out.println("c1 반지름 = " + c1.radius + ", Circle 인스턴스 개수" + c1.numberOfObjects);
		System.out.println("c2 반지름 = " + c2.radius + ", Circle 인스턴스 개수" + c2.numberOfObjects);
		
		System.out.println("static method를 사용한 Circle 인스턴스의 갯수 = " + Circle.getNumberOfObjects());
		System.out.println("static method를 사용한 Circle 인스턴스의 갯수(c1) = " + c1.getNumberOfObjects());
		System.out.println("static method를 사용한 Circle 인스턴스의 갯수(c2) = " + c2.getNumberOfObjects());
	}

}
