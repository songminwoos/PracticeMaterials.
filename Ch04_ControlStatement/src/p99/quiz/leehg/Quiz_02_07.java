package p99.quiz.leehg;

import java.util.Scanner;

public class Quiz_02_07 {

	public static void main(String[] args) {
		int savingMoney;
		double yearInterestRate, monthInterestRate;
		double calcMoney = 0;
		double totalSavingMoney = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("적금 금액 : ");
		savingMoney = scan.nextInt();
		System.out.println("연 이자율 : ");
		yearInterestRate = scan.nextInt();
		
		monthInterestRate = yearInterestRate / 1200;
		//System.out.println(monthInterestRate);
		
		for(int i=0; i<6; i++)
		{
			calcMoney = ((savingMoney + calcMoney) * (1 + monthInterestRate));
			//System.out.println("calcMoney : " + calcMoney);
			totalSavingMoney += calcMoney; 
			//System.out.println("totalSavingMoney : " + totalSavingMoney);
			
		}
		
		System.out.println("6개월 후의 총 금액은 : " + totalSavingMoney + " 입니다.");
	}

}
