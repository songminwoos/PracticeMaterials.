package p01.basic4;

// 람다표기법 규칙
// 3. 추상메소드의 body가 return  키워드를 포함하여 1개의 명령어로 되어 있으면 return 키워드와 {} 제거 가능
public class MyFunctionalInterfaceEx {

	public static void main(String[] args) {
		MyFunctionalInterface fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(5, 2));

		fi = (x, y) -> {return x + y;};
		System.out.println(fi.method(5, 2));

		fi = (x, y) -> x + y;
		System.out.println(fi.method(5, 2));
		
		fi = (x,y) -> sum(x, y);
		System.out.println(fi.method(5, 2));
	}

	public static int sum(int x, int y) {
		return (x + y);
	}
}
