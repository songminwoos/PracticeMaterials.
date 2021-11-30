package p01.basic2;

// Circle class 사용 방법
// 인스턴스(Instance)의 정의 : new로 heap memory에 생성된 class 객체(Object)를 말함
// - 예로, pizza는 인스턴스라고 하고, 일반적으로 모든 인스턴스를 객체(object)라는 용어 사용
// 1. Circle의 인스턴스를 생성한 후에, Circle class에서 선언된 field, method를 사용 가능
//    - field에 대해서는 값을 변경할 수 있음. (field값을 변경 못하게 할 수도 있음..)
public class TestCircle {

	public static void main(String[] args) {
		Circle pizza = new Circle(10, "자바피자");
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "의 면적은 " + area + "입니다.");
		
		// 슈프림수퍼피자, 반지름 : 12
		pizza.radius = 12;
		pizza.name = "슈프림수퍼피자";
		area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은 " + area + "입니다.");
		
		Circle pineApplePiza = new Circle(11, "파인애플피자");
		area = pineApplePiza.getArea();
		System.out.println(pineApplePiza.name + "의 면적은 " + area + "입니다.");
		
		
		Circle donut = new Circle();	// radius는 1, name은 플레인피자
		donut.name = "도넛";
		area = donut.getArea();
		System.out.println(donut.name + "의 면적은 " + area + "입니다.");
	}

}






