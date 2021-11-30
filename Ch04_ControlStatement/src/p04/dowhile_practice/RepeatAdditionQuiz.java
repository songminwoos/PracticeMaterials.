package p04.dowhile_practice;

import java.util.Scanner;

// while문 대신에 do~while 사용하여 다시 코딩할 것
public class RepeatAdditionQuiz {

	public static void main(String[] args) {
		int number1 = (int) (Math.random()*10);
		int number2 = (int) (Math.random()*10);
		boolean bFirst = true;	// 최초 처음시작할 때 true로 setting

		Scanner input = new Scanner(System.in);

		// 초기화
		int answer = Integer.MAX_VALUE;
		
		do {
			if (bFirst == true) {
				bFirst = false;
			} else {
				System.out.println("정답이 아닙니다. 다시 시도해 보세요.");				
			}
			System.out.println(number1 + "과 " + number2 + "의 합계는 ?");
			answer = input.nextInt();
		} while ( (number1 + number2) != answer);
		
		System.out.println("예, 정답입니다. 잘 맞추셨습니다.~~");
	}

}
