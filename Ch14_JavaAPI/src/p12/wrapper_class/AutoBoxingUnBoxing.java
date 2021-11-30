package p12.wrapper_class;

public class AutoBoxingUnBoxing {

	public static void main(String[] args) {
		Integer obj1 = 100; // Auto Boxing
		System.out.println(obj1.intValue());
		
		int i1 = obj1; // Auto UnBoxing
		System.out.println(i1);
		
		int result = obj1 + 100; // Auto UnBoxing
		System.out.println(result);

		Double obj2 = 100.23; // Auto Boxing
		System.out.println(obj2.doubleValue());
		
		double d1 = obj2; // Auto UnBoxing
		System.out.println(d1);
		
		double result1 = obj2 + 12.3; // Auto UnBoxing
		System.out.println(result1);
	}

}
