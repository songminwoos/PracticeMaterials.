package p02.switch_basic;

// 주사위 숫자를 random 생성하여 switch 문 사용 예제
// 1. break : 해당 case만 실행하고 switch문을 빠져나오게 하는 효과 제공
public class SwitchBasic2 {

	public static void main(String[] args) {
		int diceNumber = (int) (Math.random()*6) + 1;

		System.out.println("diceNumber = " + diceNumber);
		
		// 주사위는 1,2,3,4,5,6 중 1개 숫자만 나옴
		switch (diceNumber) {
			case 1:		// if (diceNumber == 1)
				System.out.println("주사위가 1이 나왔습니다.");
			case 2:		// else if (diceNumber == 2)
				System.out.println("주사위가 2가 나왔습니다.");
			case 3:		// else if (diceNumber == 3)
				System.out.println("주사위가 1~3의 값이 나왔습니다.");
				break;
			case 4:		// else if (diceNumber == 4)
				System.out.println("주사위가 4가 나왔습니다.");
			case 5:		// else if (diceNumber == 5)
				System.out.println("주사위가 5가 나왔습니다.");
			default:	// else
				System.out.println("주사위가 4~6의 값이 나왔습니다.");
				break;
		}
	}

}
