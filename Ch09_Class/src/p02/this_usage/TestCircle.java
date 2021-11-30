package p02.this_usage;

public class TestCircle {

	public static void main(String[] args) {
		Circle plainPizza = new Circle();
		System.out.println("plainPizza 변수 주소 = " + System.identityHashCode(plainPizza));
		plainPizza.printCircleInformation();
		
		System.out.println();
		
		Circle largePizza = new Circle(12);
		System.out.println("largePizza 변수 주소 = " + System.identityHashCode(largePizza));
		largePizza.printCircleInformation();

		System.out.println();
		
		Circle supremPizza = new Circle("슈프림수퍼피자", 15);
		System.out.println("supremPizza 변수 주소 = " + System.identityHashCode(supremPizza));
		supremPizza.printCircleInformation();
	}

}
