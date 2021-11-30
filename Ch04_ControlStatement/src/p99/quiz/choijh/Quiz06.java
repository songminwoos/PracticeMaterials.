package p99.quiz.choijh;

import java.util.Scanner;

public class Quiz06 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sumNum = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		int inputNum = 0;
		
		while (true) {
			System.out.println("정수를 입력하세요. 0입력시 종료합니다. ");
			inputNum = input.nextInt();
			sumNum += inputNum;
			if (inputNum == 0) {
				break;
			} else {
				if (inputNum > 0) {
					positiveCount++;
				} else {
					negativeCount++;
				}
			}
		}
		
		System.out.println("입력한 양의 정수 갯수 : " + positiveCount);
		System.out.println("입력한 음의 정수 갯수 : " + negativeCount);
		System.out.println("전체 합 : " + sumNum);
		System.out.println("전체 평균 : " + (sumNum / (positiveCount + negativeCount) ));
		
	}
	
}
