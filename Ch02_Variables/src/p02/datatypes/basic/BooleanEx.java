package p02.datatypes.basic;

// boolean 타입 : 
// 1. 프로그래밍 코딩할 때 핵심적인 타입 : if, while, for, do~while 등 다양한 곳에서 사용
// 2. 현실세계에서 필요없는 데이터 타입이지만, 프로그래밍할 때는 필수 타입
// 3. 실제값은 true, false 2가지만 있음 => true, false는 boolean 리터럴 임
public class BooleanEx {

	public static void main(String[] args) {
		boolean stop = true;
		boolean start = false;
		
		System.out.println("stop = " + stop);
		System.out.println("start = " + start);
		
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

	}

}
