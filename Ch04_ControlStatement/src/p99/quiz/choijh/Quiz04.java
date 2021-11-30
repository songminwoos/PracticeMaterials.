package p99.quiz.choijh;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = (int) (Math.random() * 3);
		
		int answer;
		boolean cont = false;
		do {
			System.out.println("가위 바위 보! (가위 : 0, 바위 : 1, 보 : 2)");
			answer = input.nextInt();
			if (answer > 2 || answer < 0) {
				cont = true;
				System.out.println("지정된 가위, 바위, 보 값을 입력하세요.");
			} else {
				cont = false;
			}
		} while (cont);
		
		
		if (num == answer) {
			System.out.println("비겼습니다. ");
		} else if ( (num == 0 && answer == 2) 
				 || (num == 1 && answer == 0) 
				 || (num == 2 && answer == 1) ) {
			System.out.print("당신이 졌습니다.");
		} else {
			System.out.print("당신이 이겼습니다.");
		}
		
		String comVal = "";
		switch(num) {
			case 0 : comVal = "가위"; break;
			case 1 : comVal = "바위"; break;
			case 2 : comVal = "보"; break;
		}
		
		String youVal = "";
		switch(answer) {
			case 0 : youVal = "가위"; break;
			case 1 : youVal = "바위"; break;
			case 2 : youVal = "보"; break;
		}
	
		System.out.print("( 컴퓨터 : " + comVal + ", 당신 : " + youVal + " )");
		
	}
	
}
