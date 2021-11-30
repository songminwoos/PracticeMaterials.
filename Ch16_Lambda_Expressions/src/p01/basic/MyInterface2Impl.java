package p01.basic;

// Lambda expression의 장점
// 1. 익명객체 표현법보다 간결
// 2. 람다표기법에서 구현하는 코딩은 보통 1 line의 코딩량이 적당
public class MyInterface2Impl {

	public static void main(String[] args) {
		MyInterface2 ma = new MyInterface2() {

			@Override
			public void calculate(int x, int y) {
				System.out.println("익명객체 결과 : " + (x * y));
			}
		};
		ma.calculate(20, 30);
		
		MyInterface2 m1 = (x, y) -> {System.out.println("람다 결과 : " + (x * y));};
		m1.calculate(5, 8);
	}
}
