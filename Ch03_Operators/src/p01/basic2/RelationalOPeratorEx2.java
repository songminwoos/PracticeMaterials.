package p01.basic2;

// 비교 연산할 때 기타 프로그래밍 팁
// 1. 문자간 비교는 유니코드를 실제 정수값으로 계산을 기준으로 함
// 2. float와 double간 비교 연산을 수행하지 말 것
//    => 강제 형변환등으로 두 개의 서로 다른 type을 동일한 것으로 일치시켜 프로그래밍
public class RelationalOPeratorEx2 {

	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'B';
		
		// 문자는 unicode 값으로 비교
		boolean bResult = (ch1 < ch2);
		System.out.println("bResult = " + bResult);
		
		double d1 = 0.1;
		float f1 = 0.1f;
		
		bResult = (d1 == f1);
		System.out.println("bResult = " + bResult);
		
		bResult = ((float)d1 == f1);
		System.out.println("bResult = " + bResult);
	}

}
