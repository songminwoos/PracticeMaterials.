package p01.basic;

// Method가 왜 필요한지, 예제를 통해 설명
// 문제 : 코딩할 떄 합계 처럼 거의 유사한 코드를 반복해서 코딩하는 경우, 소스코드 양도 늘어 나고, 
// copy&paste로 에러 발생 소지도 있음
// 실제 예 : 온라인뱅킹시스템 구축할 때, 계좌 이력 조회, 계좌 이체, 금융 상품 조회, 외환달러 환전 등 
//          모든 화면에서 사용자가 로그인했는지 check하고 로그인 안했으면 해당 화면에서 에러 메세지나 
//          사용자가 입력 못하도록 막아야 함
//          => 각 화면별로 로그인 했는지를 체크하는 프로그램 코딩해야 함 (이것은 거의 100% 중복된 코드)
public class MethodBasic {

	public static void main(String[] args) {
		int sum = 0;
				
		for (int i=1;i<=10; i++) {
			sum = sum + i;
		}
		System.out.println("1과 10사이의 합 = " + sum);
		
		// 중간에 다른 코딩
		
		sum = 0;
		for (int i=20;i<=37; i++) {
			sum = sum + i;
		}
		System.out.println("27과 37사이의 합 = " + sum);
		
		// 중간에 다른 코딩

		sum = 0;
		for (int i=35;i<=49; i++) {
			sum = sum + i;
		}
		System.out.println("35과 49사이의 합 = " + sum);
		
	}

}




