package p03.method_override;

// Method overrides
public class MethodOverridingEx2 {

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();
		
		Line line = new Line();
		line.paint();	// method override
		
		Rect rect = new Rect();
		rect.paint();	// method override
		
		Circle circle = new Circle();
		circle.paint();	// method override

	}

}
