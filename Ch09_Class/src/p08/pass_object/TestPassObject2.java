package p08.pass_object;

// 1. method의 parameter로 class instance를 넘기는 방법
// 2. method의 return value type으로 class instance 넘기는 방법
public class TestPassObject2 {

	public static void main(String[] args) {
//		Circle myCircle = new Circle(1);
		Circle myCircle = createCircleInstance(1);
		System.out.println("myCircle 주소 = " + System.identityHashCode(myCircle));

		int times = 5;
		
		System.out.println("Radius \t\t  Area");
		while (times >=1) {
			System.out.println(myCircle.getRadius() + "\t\t" + myCircle.getArea());
			myCircle.setRadius(myCircle.getRadius()+1);
			times--;
		}

	}

	public static Circle createCircleInstance(double radius) {
		if (radius <0) {
			return null;
		}
		
		Circle c = new Circle(radius);
		System.out.println("c 주소 = " + System.identityHashCode(c));
		
		return c;
	}
}
