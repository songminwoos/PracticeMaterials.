package p04.dowhile_basic;

// 100번 출력하라
// do~while문과 while문의 차이점
// 1. do~while은 무조건 1번 실행함
// 2. while은 조건식에 의해 1번도 실행하지 않을 수 있음
public class DoWhileBasic {

	public static void main(String[] args) {
		int count = 0;
		
		do {
			System.out.println("Java씨, 너무너무 존경합니다.");
			count++;
		} while (count < 10);

	}

}
