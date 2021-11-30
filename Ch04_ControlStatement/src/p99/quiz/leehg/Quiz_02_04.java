package p99.quiz.leehg;

import java.util.Scanner;

public class Quiz_02_04 {

	public static void main(String[] args) {
		int random = (int)(Math.random() * 3);
		int inputNum;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위(0),바위(1),보(2) 중 하나의 숫자를 입력하세요. : ");
		inputNum = scan.nextInt();
		
		if(random == inputNum)
		{
			System.out.println("컴퓨터가 낸 것은 " + random + " 당신이 낸 것은 " + inputNum + "\n무승부!");	
		}
		else if(random == 0 && inputNum == 1)
		{
			System.out.println("컴퓨터가 낸 것은 " + random + " 당신이 낸 것은 " + inputNum + "\n승리!");	
		}
		else if(random == 0 && inputNum == 2)
		{
			System.out.println("컴퓨터가 낸 것은 " + random + " 당신이 낸 것은 " + inputNum + "\n패배!!");
		}
		else if(random == 1 && inputNum == 0)
		{
			System.out.println("컴퓨터가 낸 것은 " + random + " 당신이 낸 것은 " + inputNum + "\n패배!!");
		}
		else if(random == 1 && inputNum == 2)
		{
			System.out.println("컴퓨터가 낸 것은 " + random + " 당신이 낸 것은 " + inputNum + "\n승리!");
		}
		else if(random == 2 && inputNum == 0)
		{
			System.out.println("컴퓨터가 낸 것은 " + random + " 당신이 낸 것은 " + inputNum + "\n승리!");
		}
		else if(random == 2 && inputNum == 1)
		{
			System.out.println("컴퓨터가 낸 것은 " + random + " 당신이 낸 것은 " + inputNum + "\n패배!");
		}
		else
			System.out.println("잘못 입력했어요!");
		
	}

}
