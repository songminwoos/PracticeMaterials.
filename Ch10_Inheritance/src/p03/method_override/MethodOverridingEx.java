	package p03.method_override;

// Method overrides
// 1. 부모 클래스의 메소드와 자식 클래스의 메소드의 signature가 동일한 경우만 해당
//    - signature가 같다는 의미 : method이름, parameter갯수, 각 parameter마다 data type이 동일한 경우를 의미
// 2. method override의 정의 : 부모에서 정의된 method가 있는데, 자식이 동일한 method signature를 만들어 정의를 하면
//                           부모 method를 호출하는 것이 아니라, 자식 method를 호출하는 것을 말함
public class MethodOverridingEx {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.draw();
		
		Line line = new Line();
		line.draw();	// method override
		
		Rect rect = new Rect();
		rect.draw();	// method override
		
		Circle circle = new Circle();
		circle.draw();	// method override

	}

}
