package p99.quiz.leehg;

import java.util.Scanner;

public class Quiz_02_06 {

	public static void main(String[] args) {
		int inputNum;
		double average = 0;
		int sum = 0;
		int posNum = 0, negNum = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("정수를 입력하세요 (0 입력시 종료) : ");
			inputNum = scan.nextInt();
			if(inputNum == 0)
			{
				break;
			}
			
			sum += inputNum;
			
			if(inputNum > 0)
			{
				posNum++;
			}
			else if(inputNum < 0)
			{
				negNum++;
			}
		}
		
		count = posNum + negNum; 
		average = (double) sum / count;
		
		System.out.println("양의 정수 숫자 : " + posNum + " 음의 정수 숫자 : " + negNum + " 전체 합 : " + sum + " 전체 평균 값 : " + average);
	}

}
