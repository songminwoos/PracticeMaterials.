package p99.quiz.choijh;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("전체 학생수를 입력하세요.");
		int studentNum = input.nextInt();
		
		int maxScore = 0;
		int maxIndex = 0;
		int score = 0;
				
		int i = 1;
		while(i <= studentNum) {
			System.out.println("학생 " + i + "의 점수를 입력하세요. ");
			score = input.nextInt();
			if (score > maxScore) {
				maxScore = score;
				maxIndex = i;
			}
			i++;
		}
		
		System.out.println("최고 점수는 학생 " + maxIndex + "의 " + maxScore + "점 입니다.");
	}
	
}
