package p01.basic;

// 2차원 배열 (2 dimensional Array) => table 형태의 data를 관리하기에 적합
// 1. Table형태의 데이터를 관리하기 위해서 사용함
// 2. 2차원 배열은 원소가 1차원배열인 것으로 생각할 수도 있음
//    - {"1", "박철호", "서울", "회사원"}
// 3. gPerson[1][2]  => 2차원 배열인 gPerson에서 2번째 행(행번호 1)의 3번째 열(열번호 2)인 "공무원" 데이터값을 가리킴
//    - 행 : row, row index값은 0부터 시작
//    - 열 : column, column index값은 0부터 시작
//    - 예를 들면 gPerson 2차원 배열 변수는 3행 X 4열의 구조를 가짐
public class TwoDimArrayBasic {

	public static void main(String[] args) {
		String[][] gPerson = { 
								{"1", "박철호", "서울", "회사원"},
								{"2", "김의실", "경남", "공무원"},
								{"3", "오수철", "부산", "연예인"}
							 };
		System.out.println("gPerson[0] 주소 = " + System.identityHashCode(gPerson[0]));
		System.out.println("gPerson[1] 주소 = " + System.identityHashCode(gPerson[1]));
		System.out.println("gPerson[2] 주소 = " + System.identityHashCode(gPerson[2]));
		String[] onePerson = new String[4];
		onePerson = gPerson[2];
		for (int i=0; i<onePerson.length;i++) {
			System.out.println("onePerson["+i+"] = " + onePerson[i]);
		}

		System.out.println("gPerson[0][0] = " + gPerson[0][0]);
		System.out.println("gPerson[0][1] = " + gPerson[0][1]);
		System.out.println("gPerson[0][2] = " + gPerson[0][2]);
		System.out.println("gPerson[0][3] = " + gPerson[0][3]);
		
		System.out.println("gPerson[1][0] = " + gPerson[1][0]);
		System.out.println("gPerson[1][1] = " + gPerson[1][1]);
		System.out.println("gPerson[1][2] = " + gPerson[1][2]);
		System.out.println("gPerson[1][3] = " + gPerson[1][3]);

		System.out.println("gPerson[2][0] = " + gPerson[2][0]);
		System.out.println("gPerson[2][1] = " + gPerson[2][1]);
		System.out.println("gPerson[2][2] = " + gPerson[2][2]);
		System.out.println("gPerson[2][3] = " + gPerson[2][3]);
	}

}
