package p99.quiz.leehg;

import java.util.Scanner;

public class Quiz_02_08 {

	public static void main(String[] args) {
		int students, score;
		int bestScore = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전체 학생 수는 ? : ");
		students = scan.nextInt();
		
		for(int i=0; i<students; i++)
		{
			System.out.println("각 학생별 점수는?");
			score = scan.nextInt();
			
			if(score > bestScore)
			{
				bestScore = score;
			}
		}
		System.out.println("최고 점수는 : " + bestScore);
	}

}
