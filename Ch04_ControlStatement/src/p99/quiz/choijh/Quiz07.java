package p99.quiz.choijh;

import java.util.Scanner;

public class Quiz07 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("매월 적금 금액을 입력하세요. (단위 : 원)");
		double monthlyMoney = input.nextDouble();
		System.out.println("1년 이자율을 입력하세요. (단위 : %)");
		double interestRate = input.nextDouble();
		
		double monthlyInterestRate = (interestRate / 12) / 100;

		double total = monthlyMoney * (1 + monthlyInterestRate);
		total = (monthlyMoney + total) * (1 + monthlyInterestRate);
		for (int i=2; i<6; i++) {
			total = (monthlyMoney + total) * (1 + monthlyInterestRate);
		}
		System.out.println("6개월 후 총 금액 => " + total + "원");
		
	}
}
