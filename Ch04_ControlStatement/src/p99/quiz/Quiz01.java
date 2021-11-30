package p99.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// Generate an integer between 1 and 12.
		int month = (int)((Math.random() * 12) + 1);

		// Display the English month name
		switch (month)
		{
			case 1: 
				System.out.println("1월 입니다."); 
				break;
			case 2: 
				System.out.println("2월 입니다."); 
				break;
			case 3: 
				System.out.println("3월 입니다."); 
				break;
			case 4: 
				System.out.println("4월 입니다."); 
				break;
			case 5: 
				System.out.println("5월 입니다."); 
				break;
			case 6: 
				System.out.println("6월 입니다."); 
				break;
			case 7: 
				System.out.println("7월 입니다."); 
				break;
			case 8: 
				System.out.println("8월 입니다."); 
				break;
			case 9: 
				System.out.println("9월 입니다."); 
				break;
			case 10: 
				System.out.println("10월 입니다."); 
				break;
			case 11: 
				System.out.println("11월 입니다."); 
				break;
			case 12: 
				System.out.println("12월 입니다."); 
				break;
		}
	}

}
