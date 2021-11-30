package p01.nested_class;

public class OuterEx {

	public static void main(String[] args) {
		
		// Inner_Instance class 사용 예
		Outer o = new Outer();
		
		Outer.Inner_Instance oi = o.new Inner_Instance();
		oi.field1 = 3;
		oi.method1();
		
		// Inner_Static class 사용 예
		Outer.Inner_Static os = new Outer.Inner_Static();
		os.field1 = 3;
		os.field2 = 5;
		os.method1();
		os.method2();

		// LocalClass 클래스 사용 예
		// Outer class 외부 class에서 Local class를 위하여 별도로 new로 인스턴스 만들 필요 없음
		o.outer_method();
	}

}
