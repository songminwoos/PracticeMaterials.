package p01.practice;

import java.util.Scanner;

// method에 2차원 배열을 paramter로 넘기기 실습
// 1. method에서 2차원 배열을 paramter로 넘기는 것도 가능 (예로, sum() )
// 2. method의 return 값으로 2차원 배열을 넘길 수도 있음 (예로, getArray() )
public class PassTwoDimArray {

	public static void main(String[] args) {
		int[][] numbers = getArray();

		for (int row = 0; row < numbers.length; row++) {
			for (int column=0; column < numbers[row].length; column++) {
				System.out.print(numbers[row][column] + " ");
			}
			System.out.println();
		}
		
		// 2차원 배열의 모든 원소의 합 출력
		System.out.println("2차원 배열 원소 전체의 합 = " + sum(numbers));
	}

	// return value type : 2차원 배열인 int[][]
	public static int[][] getArray() {
		int[][] num = new int[2][3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("2행 3열 데이터에 대하여 행 단위로 space로 구분된 데이터를 enter key를 쳐서 입력하세요.");

		for (int row = 0; row < num.length; row++) {
			for (int column=0; column < num[row].length; column++) {
				num[row][column] = input.nextInt();
			}
		}
		
		return num;
	}
	
	public static int sum(int[][] m) {
		int total = 0;
		
		for (int i=0; i<m.length;i++) {
			for (int j=0; j<m[i].length;j++) {
				total = total + m[i][j];
			}
		}
		
		return total;
	}
}











