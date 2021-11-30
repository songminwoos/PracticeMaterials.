package p04.nan_infinity;

// 실수 연산할 때 프로그래밍 팁
// 1. 나누기(/) 연산할 때 분모가 0이 아닌 것을 반드시 프로그램내에서 check해야 함 (이유 : 무한대 발생 가능)
// 2. 나머지(%) 연산할 때 분모가 0이 아닌 것을 반드시 프로그램내에서 check해야 함 (이유 : NaN 발생 가능)
public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		
		double z;
		
//		if (y != 0.0) {
//			z = x/y;
//		} else {
//			System.out.println("y가 0이어서 나누기 연산할 수 없습니다.");
//		}
		
//		z = x/y;
		z = x % y;	// NaN (Not a Number)
		
		System.out.println("z = " + z);
		
		if ( (Double.isInfinite(z)) || (Double.isNaN(z)) ) {
			System.out.println("z의 값을 산출할 수 없습니다.");
		} else {
			z = z + 2;
		}
		
		System.out.println("z = " + z);

	}

}
