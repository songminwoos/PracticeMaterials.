package p99.quiz.leehg;

import java.util.Scanner;

public class Quiz_02_05 {

	public static void main(String[] args) {
		int random = (int)(Math.random() * 101);
		int inputNum = -1;
		
		Scanner scan = new Scanner(System.in);
	
		while(random == inputNum)
		{
			System.out.println("0~100까지의 숫자를 추측해보세요~ : ");
			inputNum = scan.nextInt();
			
			if(random == inputNum)
			{
				System.out.println("입력한 숫자는 " + inputNum + " 랜덤 숫자는 : " + random + " " + "정답입니다!");
				
			}
			else if(random > inputNum)
			{
				System.out.println("추측한 숫자가 낮습니다.");
			}
			else if(random < inputNum)
			{
				System.out.println("추측한 숫자가 높습니다.");
			}
			else
				System.out.println("잘못 입력하셨습니다");
		}
	}

}
