package p12.wrapper_class;

// 1. primitive값이 같더라도 Auto Boxing할 떄 heap Memory에 별도의 메모리에 할당함
// 2. Wrapper class의 instance값을 비교하는 방법 
//    1) primitive type으로 변환하는 방법
//    2) equals method 사용하는 방법
public class ValueCompareEx {

	public static void main(String[] args) {
		Integer obj1 = 300;  
		Integer obj2 = 300;
		
		System.out.println("obj1 == obj2의 결과값 : " + (obj1 == obj2));
		System.out.println("UnBoxing후의 obj1 == obj2의 결과값 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("obj1.equals(obj2)의 결과값 : " + (obj1.equals(obj2)));
	}

}
