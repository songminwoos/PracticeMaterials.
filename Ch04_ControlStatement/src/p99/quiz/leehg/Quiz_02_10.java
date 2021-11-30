package p99.quiz.leehg;

public class Quiz_02_10 {

	public static void main(String[] args) {
		int result = 0;
		
		for(int i=1; i<=100; i++)
		{
			if(i%3==0)
			{
				result += i;
			}
		}
		System.out.println("1부터 100까지 3의 배수의 합은 : " + result);
	}
}
