package p99.quiz.leehg;

import java.util.Scanner;

public class Quiz_02_03 {

	public static void main(String[] args) {
		int inputNum1, inputNum2, inputNum3;
		int temp;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("3개의 정수 값을 입력하세요.");
		inputNum1 = scan.nextInt();
		inputNum2 = scan.nextInt();
		inputNum3 = scan.nextInt();
		
		if (inputNum1 > inputNum2)
		{
			temp = inputNum2;
			inputNum2 = inputNum1;
			inputNum1 = temp;
		}
		if (inputNum2 > inputNum3)
		{
			temp = inputNum3;
			inputNum3 = inputNum2;
			inputNum2 = temp;
		}
		if (inputNum1 > inputNum2)
		{
			temp = inputNum2;
			inputNum2 = inputNum1;
			inputNum1 = temp;
		}
		
		System.out.println(inputNum1 + " " + inputNum2 + " " + inputNum3);
		
		
	}

}
