package p03.method_override_super;

public class Rect extends Shape {
	String name;

	@Override
	public void draw() {
		System.out.println("name : " + name);
	}
	
}
