package p99.quiz.choijh;

public class Quiz09 {

	public static void main(String[] args) {
	
		System.out.println("Pattern A");
		for (int i=0; i<6; i++) {
			for (int j = 0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("Pattern B");
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if ((i + j) <= 5) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		System.out.println("Pattern C");
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if ((i + j) >= 5) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	
		System.out.println("Pattern D");
		for (int i=0; i<=6; i++) {
			for (int j=0; j<=6; j++) {
				if (i >= j) {
					System.out.print("  ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}
	
}
