package p99.quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double monthlyInterestRate=0.0;

		// Prompt the user to enter a montly saving amount
		System.out.print("Enter the monthly saving amount and Annual Interest rate: ");
		double savingAmount = input.nextDouble();
		monthlyInterestRate = input.nextDouble()/1200;
		
		double total=0.0;
		for (int i=0; i<6; i++) {
			total = (savingAmount + total) * (1 + monthlyInterestRate);
		}
//		// Compute first month account value
//		total = 100 * (1 + monthlyInterestRate);
//		// Compute second month account value
//		total = (100 + total) * (1 + monthlyInterestRate);
//		// Compute third month account value
//		total = (100 + total) * (1 + monthlyInterestRate);
//		// Compute forth month account value
//		total = (100 + total) * (1 + monthlyInterestRate);
//		// Compute fifth month account value
//		total = (100 + total) * (1 + monthlyInterestRate);
//		// Compute sixth month account value
//		total = (100 + total) * (1 + monthlyInterestRate);

		// Display result
		System.out.println("After the sixth month, the account value is " + total);
	}

}
