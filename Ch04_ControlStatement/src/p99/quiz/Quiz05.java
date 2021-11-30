package p99.quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// Generate a random integer 0~100
		int number = (int)(Math.random() * 101);

		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter a number 0, 1, or 2
		System.out.print("0과 100사이의 숫자 중 하나를 추측하는 게임입니다.");

		int guess = -1;

		while (guess != number) {
			System.out.println("추측하는 숫자를 입력하세요");
			guess = input.nextInt();
		}

	}

}
