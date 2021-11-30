package q_sol;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double monthlyInterestRate=0.0;

		// Prompt the user to enter a montly saving amount
		System.out.print("Enter the monthly saving amount and Annual Interest rate: ");
		double savingAmount = input.nextDouble();
		monthlyInterestRate = input.nextDouble()/12;
		
		// Compute first month account value
		double total = 100 * (1 + monthlyInterestRate);
		// Compute second month account value
		total = (100 + total) * (1 + monthlyInterestRate);
		// Compute third month account value
		total = (100 + total) * (1 + monthlyInterestRate);
		// Compute forth month account value
		total = (100 + total) * (1 + monthlyInterestRate);
		// Compute fifth month account value
		total = (100 + total) * (1 + monthlyInterestRate);
		// Compute sixth month account value
		total = (100 + total) * (1 + monthlyInterestRate);

		// Display result
		System.out.println("After the sixth month, the account value is " + total);
	}

}
