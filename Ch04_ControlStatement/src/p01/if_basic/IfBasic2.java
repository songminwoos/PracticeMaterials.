package p01.if_basic;

public class IfBasic2 {

	public static void main(String[] args) {
		int i = 10;
		
		if (i>0) {
			System.out.println("i는 양수입니다.");
		}

		// if 안에 있는 실행문이 1개 명령어만 있으면 { }를 빼도 됨 =-> 하지만 비추천
		if (i>0)
			System.out.println("i가 역시 양수입니다.");
	
		if (i % 5 == 0) {
			System.out.println("i는 5의 배수입니다.");
		}

		if (i % 2 == 0) {
			System.out.println("i는 2의 배수입니다.");
		}
		
		if ( (i%5==0) || (i%2==0)) {
			System.out.println("i는 5의 배수이거나 2의 배수입니다.");
		}

		if ( (i%5==0) && (i%2==0)) {
			System.out.println("i는 5의 배수이면서 2의 배수입니다. => 10의 배수입니다.");
		}
	}

}







