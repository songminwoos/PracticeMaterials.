package p02.superclass_constructor4;

// 1. 부모 class의 field(method도 해당)를 접근할 때,
//    원칙적으로 부모의 인스턴스인 super를 통해서 가져오는 것이 맞으나
//    자식 인스턴스인 this를 통해서도 부모의 field, method 접근 가능
// 2. 자식 인스턴스인 this를 통해서 부모 인스턴스인 super의 field, method를 접근하는 방법
//    - 자식 인스턴스인 this를 통해 field, method를 접근하면,
//      1) Java에서 내부적으로 자식 인스턴스에서 field, method를 먼저 찾고,
//      2) 자식 인스턴스에서 없으면 부모 인스턴스에서 field, method가 있는지 찾도록 내부적으로 구현되어 있음
public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint() {

	}
	
	public ColorPoint(int x, int y) {
//		super(x, y);
		super.x = x;
		super.y = y;
	}
	
	public ColorPoint(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setColorAndPoint(String color, int x, int y) {
		this.color = color;
		this.x = x;
		this.y = y;
	}
	
	public void showColorPoint() {
		System.out.print("color = " + color + ", ");
		showPoint();
	}
}
