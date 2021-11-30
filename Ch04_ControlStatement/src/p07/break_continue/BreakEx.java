package p07.break_continue;

// Math.random()함수를 이용하여여 1,2,3,4,5,6 주사위 숫자를 생성한 후에
// while문에 주사위 숫자가 6이 나오지 않을 때 까지 반복 loop도는 예제
// break 명령어 : for, while, do~while, switch문에서 loop를 빠져 나오게 하는 명령어
public class BreakEx {

	public static void main(String[] args) {
		
		// while문에서 조건식을 true로 하면 while문이 무한 loop 돈다.
		while (true) {
			int num = (int) (Math.random()*6) + 1;
			System.out.println("주사위 번호 = " + num);
			if (num == 6) {
				break;
			}
		}

		System.out.println("주사위 게임 종료");
		
		// 커피머신, 음식주문자동기계는 무한 반복하여 주문을 받을 수 있도록 만듬
		while (true) {
			// 음식 주문 입력 내용 받음
			// 주문된 음식 요리
			// 고객에게 음식 전달
			
			// 기계가 에러가 발생등 이상 상태가 발생할 경우 break를 통해 while loop를 빠져나옴
			int error=0;
			if (error != 0) {
				break;
			}
		}
		
	}

}







