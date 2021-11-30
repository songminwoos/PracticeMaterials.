package p03.method_override_super;

// 자식 클래스에서 부모 클래스의 필드와 메소드를 호출할 경우에는
// super. 을 사용하면 됨.
// 예 : super.name = "Shape";를 사용하면 부모클래스인 Shape의 name field에 "Shape"을 넣음
//     super.draw();를 사용하면 부모클래스의 override된 draw() method를 실행가능
public class Circle extends Shape {
	String name;

	@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape_New";
		super.draw();
		System.out.println("name : " + name);
	}

}
