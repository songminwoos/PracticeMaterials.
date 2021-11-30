package p02.switch_basic;

public class SwtichBasic5 {

	public static void main(String[] args) {
		int orginal_score = 79;
		int converted_score;
		
		// 원점수에서 10을 나누면 소숫점 자리가 제거되서 2번째 숫자만 남음
		converted_score = orginal_score / 10;
		
		switch(converted_score) {
		case 10:
		case 9:
			System.out.println("A 등급 입니다.");
			break;
		case 8:
			System.out.println("B 등급 입니다.");
			break;
		case 7:
			System.out.println("C 등급 입니다.");
			break;
		case 6:
			System.out.println("D 등급 입니다.");
			break;
		default:
			System.out.println("F 등급 입니다.");
			break;
		}

	}

}
