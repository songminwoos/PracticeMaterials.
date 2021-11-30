package p02.switch_basic;

// 주사위 숫자를 random 생성하여 switch 문 사용 예제
// switch 문
// 1. 기본적으로 if ~ else if ~ else를 대체하는 효과
// 2. case에 나오는 경우는 조건식이 들어갈 수 없음 => else if (diceNumber == 1) 허용, else if (diceNumber >= 3)
// 3. 유용한 사용 대상 : case값이 갯수가 정해진 경우에 유용 (주사위, 달력 월 : 1월 ~ 12월, 회사 직급("사원", "대리" "과장", "차장",..) 
public class SwitchBasic {

	public static void main(String[] args) {
		// (int) (Math.random()*6) => 0,1,2,3,4,5
		int diceNumber = (int) (Math.random()*6) + 1;

		System.out.println("diceNumber = " + diceNumber);
		
		// 주사위는 1,2,3,4,5,6 중 1개 숫자만 나옴
		switch (diceNumber) {
			case 1:		// if (diceNumber == 1)
				System.out.println("주사위가 1이 나왔습니다.");
				break;
			case 2:		// else if (diceNumber == 2)
				System.out.println("주사위가 2가 나왔습니다.");
				break;
			case 3:		// else if (diceNumber == 3)
				System.out.println("주사위가 3이 나왔습니다.");
				break;
			case 4:		// else if (diceNumber == 4)
				System.out.println("주사위가 4가 나왔습니다.");
				break;
			case 5:		// else if (diceNumber == 5)
				System.out.println("주사위가 5가 나왔습니다.");
				break;
//			case 6:		// else if (diceNumber == 6)
			default:	// else
				System.out.println("주사위가 6이 나왔습니다.");
				break;
		}
	}

}
