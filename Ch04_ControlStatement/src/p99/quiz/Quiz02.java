package p99.quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter weight, feet and inches
		System.out.print("체중(kg단위)을 입력하세요(소숫점 2자리까지) : ");
		double weight = input.nextDouble();
		System.out.print("키(meter)를 입력하세요(소숫점 2자리까지) : ");
		double heigt = input.nextDouble();

		// Compute BMI
		double bmi = weight / (heigt*heigt);

		// Display result
		System.out.println("비만도 (BMI) : " + bmi);
		if (bmi < 18.5)
			System.out.println("저체중 입니다.");
		else if (bmi < 25)
			System.out.println("정상 체중 입니다.");
		else if (bmi < 30)
			System.out.println("과체중 입니다.");
		else
			System.out.println("비만 입니다.");
	}

}
