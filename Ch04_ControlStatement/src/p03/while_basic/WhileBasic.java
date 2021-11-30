package p03.while_basic;

// for, while, do~while 공통사항
// 1. 반복적인 command를 처리할 때 매우 유용한 커맨드
//    예) 50만명 수능 성적처리 등
// 2. 초기값과 while 조건식을 꼼꼼이 살펴볼 필요 있음
public class WhileBasic {

	public static void main(String[] args) {
		
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");
//		System.out.println("Java씨, 너무너무 사랑스럽다.");

		int count = 0;
		// count < 10 이 true인 동안에 while문을 반복 수행
		while (count < 10) {
			System.out.println("Java씨, 너무너무 사랑스럽다.");
			count++;
			System.out.println("count = " + count);
		}
		System.out.println();
		count = 1;
		while (count <= 10) {
			System.out.println("Java씨, 너무너무 사랑스럽다.");
			count++;
			System.out.println("count = " + count);
		}

		System.out.println();

		int endValue = 10;
		count = 1;
		while (count <= endValue) {
			System.out.println("Java씨, 너무너무 사랑스럽다.");
			count++;
			System.out.println("count = " + count);
		}
		
	}

}











