package p99.quiz.leehg;

import java.util.Scanner;

public class Quiz_02_02 {

	public static void main(String[] args) {
		double bmi;
		double weight, height;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("체중을 입력하세요 (단위 : kg) : ");
		weight = scan.nextDouble();
		System.out.println("키를 입력하세요 (단위 : m) : ");
		height = scan.nextDouble();
		
		bmi = weight / (height * height);
		
		if(bmi >= 30)
		{
			System.out.println("BMI는 " + bmi + " 로 비만 입니다." );
		}
		else if(bmi >= 25 && bmi < 30)
		{
			System.out.println("BMI는 " + bmi + " 로 과체중 입니다." );
		}
		else if(bmi >= 18.5 && bmi < 25)
		{
			System.out.println("BMI는 " + bmi + " 로 정상 입니다." );
		}
		else if(bmi < 18.5)
		{
			System.out.println("BMI는 " + bmi + " 로 저체중 입니다." );
		}
		else
			System.out.println("입력이 잘못되었습니다.");

	}

}
