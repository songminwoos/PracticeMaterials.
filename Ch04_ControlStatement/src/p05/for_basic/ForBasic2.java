package p05.for_basic;

//Nested For문 (중첩 for문 : for문 안에 for문이 있는 경우)
// 9*9단을 코딩
public class ForBasic2 {

	public static void main(String[] args) {
		System.out.println("구구단은 다음과 같습니다.");
		
		// dan이 3이면 3단 이라는 의미
		for (int dan=1; dan<=9; dan++) {
			System.out.println(dan + "단 출력값");			
			for (int num=1; num<=9; num++) {
				System.out.println(dan + " * " + num + " = " + (dan*num) );
			}
			System.out.println();
		}
	}

}
