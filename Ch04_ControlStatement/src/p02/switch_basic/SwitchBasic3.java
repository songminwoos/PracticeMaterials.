package p02.switch_basic;

// switch 문에서 case문에 문자열(String) 사용 가능
// switch 문에서 case문에 사용 가능한 data type : byte, char, short, int, long, String만 가능
// float, double등은 사용 불가
public class SwitchBasic3 {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("급여가 700만원 입니다.");
			break;
		case "과장":
			System.out.println("급여가 500만원 입니다.");
			break;
		case "대리":
			System.out.println("급여가 400만원 입니다.");
			break;
		default:
			System.out.println("급여가 300만원 입니다.");
			break;
		}

	}

}
