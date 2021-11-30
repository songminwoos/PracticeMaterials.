package p99.quiz.choijh;

import java.util.Scanner;

public class Quiz05 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number = (int) (Math.random() * 101);
		
		int answer;
		
		do {
			System.out.println("1~100까지 숫자를 추측해 보세요?");
			answer = input.nextInt();
			if (number == answer) {
				System.out.println("숫자 " + number + " 정확히 맞추었습니다.");
				break;
			} else {
				if (number > answer) {
					System.out.println("당신이 추측한 숫자의 값이 낮습니다.");
				} else {
					System.out.println("당신이 추측한 숫자의 값이 높습니다.");
				}
			}
		} while (true);
		
	}

}
