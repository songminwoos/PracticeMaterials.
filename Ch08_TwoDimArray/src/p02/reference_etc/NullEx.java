package p02.reference_etc;

// 참조 객체의 초기값으로 null 이라는 용어 사용
// 1. null 의 의미 : 참조객체 변수의 값에 주소가 없다.
//    => heap memory에 해당 변수로 생성된 객체가 없다
// 2. null은 String, 1차원 배열, 2차원 배열, class, interface등 모든 참조객체의 초기값으로 사용
public class NullEx {

	public static void main(String[] args) {
		String name = "홍길동";
		String name1 = null;
		int[] n = null;
		int[][] n2 = null;
		String[] ss = null;
		int sum = 0;
		
		if (name1 == null) {
			name1 = "김길동";
		}

	}

}
