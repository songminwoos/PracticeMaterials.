package p01.basic3;

// 람다표기법 규칙
// 2. 추상메소드의 parameter가 1개만 있는 경우 ()를 제거 가능
public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = (x) -> {System.out.println(x*5);};
		fi.method(5);
		
		fi = x -> System.out.println(x*5);
		fi.method(5);
	}

}
