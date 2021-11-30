package p99.quiz.choijh;

import java.util.Scanner;

public class Quiz02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("체중을 입력하세요. (단위 : kg) 소숫점 2자리까지 입력해 주세요, 예) 56.55");
		double weight = input.nextDouble();
		
		System.out.println("키를 입력하세요. (단위 : m)");
		double height = input.nextDouble();
		
		double bmi = weight / (height * height);
		
		if (bmi < 18.5) {
			System.out.print("저체중 입니다.");
		} else if ((bmi >= 18.5) && (bmi < 25)) {
			System.out.print("정상 체중 입니다.");
		} else if ((bmi >= 25) && (bmi < 30)) {
			System.out.print("과체중 입니다.");
		} else if (bmi >= 30) {
			System.out.print("비만 입니다.");
		} 
		
		System.out.print(" (체지방률 : " + bmi + ")");
	}
}
