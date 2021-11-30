package p05.for_basic;

import java.util.Scanner;

// for문은 정해진 횟수를 반복 연산하는 경우에 가장 적합함
// 예로, 50만명 수능 점수 구하기 등
public class ForBasic {

	public static void main(String[] args) {
		int sum = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("1부터 시작하여 합계를 구할 최종 숫자를 입력하세요 ");
		int lastNumber = input.nextInt();
		
		// int number=1; => number값을 초기화
		// number<=10    => while문의 조건식
		// number++      => while문 본문에서 number를 1씩 증가시킨것과 동일 
		for (int number=1; number<=lastNumber;number++) {
			sum = sum + number;
		}
		
//		System.out.println("1~10의 합 = " + sum);
		System.out.println("1 ~ " + lastNumber +"의 합 = " + sum);
	}

}










