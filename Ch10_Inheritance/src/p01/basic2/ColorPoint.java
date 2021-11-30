package p01.basic2;

// 자식 클래스 method등에서 부모 클래스의 field, method 사용 가능
public class ColorPoint extends Point {
	private String color;
	
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
