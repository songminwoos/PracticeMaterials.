package p99.quiz.leehg;

public class Quiz_02_09_04 {

	public static void main(String[] args) {
		for(int i=1; i<7; i++)
		{
			for(int j=1; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int k=7; k>i; k--)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
