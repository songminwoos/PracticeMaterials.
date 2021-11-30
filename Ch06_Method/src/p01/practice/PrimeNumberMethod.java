package p01.practice;

// 소수 (prime number) 구현
// - 자기 자신을 제외하고는 나눌 수 없는 수
// - 1은 제외, (2, 3, 5, 7, 11, 13, 17, 23,..)
public class PrimeNumberMethod {

	public static void main(String[] args) {
		System.out.println("가장 작은 소수부터 20개의 소수 : ");
		printPrimeNumbers(20);

	}

	public static void printPrimeNumbers(int numberOfPrimes) {
//		final int NUMBER_OF_PRIMES_PER_LINE = 10;	// 1 line에 10개씩 소수를 출력
		int count = 0; // 소수 갯수
		int number = 2;	// 특정 정수가 pirme인지 아닌지를 판단하기 위한 것
		
		while (count < numberOfPrimes) {
			if (isPrime(number)) {
				count++;
				System.out.println(count + "번째 소수 = " + number);
			}
			number++;
		}
	}
	
	public static boolean isPrime(int number) {
		
		// 특정 숫자 number가 소수 판별하기 위해서는 2부터 시작해서 number/2까지 for문을 수행하면서 나눠지는 수가 있는지 판단하면 됨 
		for (int divisor=2; divisor<=number/2; divisor++) {
			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}
}












