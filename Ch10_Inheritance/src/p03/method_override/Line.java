package p03.method_override;

// @Override : override annotation 표기로, method 이름 위에서 사용
// => 의미 : JVM에게 이 메소드는 override한 메소드인 것을 알려주는 것으로,
//          부모 class에서 signature가 동일한 method가 선언되어 있지 않으면 자동으로 에러를 발생시킴 
public class Line extends Shape {

	@Override
	public void draw() {
		System.out.println("Line class - draw()");
	}

}
