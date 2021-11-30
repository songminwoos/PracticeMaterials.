package p01.basic;

// 1. 배열(Array) 생성 방법
//   1) 배열에 초기값을 넣어 생성 
//     - {}를 사용, 예를 들면 {10, 20, 30, 40}는 4개 원소를 갖는 배열 생성
//   2) 배열 변수이름만 선언하고, 나중에 배열 방크기와 배열 원소의 값을 주는 방법
//   3) 배열 원소의 값이 없는 배열 크기만 생성
//     - 예를 들면, arr4에 원소의 type이 int인 방 4개를 만들어 줘 => 4bytes * 4 => total 16bytes 만들어 줌

// 2. 배열 선언 문법 : 
//   1) 배열원소type + [] + 변수 이름 => 예를 들면, int[] arr => 배열변수이름은 arr이고, 배열 원소의 data type은 integer라는 의미
//       => 추천 방식
//   2) 배열원소type + 변수이름 + []  =>  예를 들면, int arr1[] => 배열변수이름은 arr1이고, 배열 원소의 data type은 integer라는 의미
//      => 비추천 방식

// 3. 배열의 data type => 배열원소type + []

// 4. 배열원소의 시작 index는 0부터 시작 (첫번째 배열원소의 index는 0)
// 5. 배열원소의 전체 갯수는 ? .length 를 이용하여 구할 수 있음
public class ArrayBasic {

	public static void main(String[] args) {
		// 첫번째 배열 생성 방법 : 초기값 {} 사용
		int[] arr = {10, 20, 30, 40};
		
		System.out.println("arr의 첫번째 원소 = " + arr[0]);
		System.out.println("arr의 두번째 원소 = " + arr[1]);
		System.out.println("arr의 세번째 원소 = " + arr[2]);
		System.out.println("arr의 네번째 원소 = " + arr[3]);
		System.out.println("arr 배열 전체 원소 갯수 = " + arr.length);

		int arr1[] = {50, 60, 70, 80};
		
		System.out.println("arr1의 첫번째 원소 = " + arr1[0]);
		System.out.println("arr1의 두번째 원소 = " + arr1[1]);
		System.out.println("arr1의 세번째 원소 = " + arr1[2]);
		System.out.println("arr1의 네번째 원소 = " + arr1[3]);
		System.out.println("arr1 배열 전체 원소 갯수 = " + arr1.length);

		double[] arr2 = {1.0, 2, 3, 4};
		System.out.println("arr2의 첫번째 원소 = " + arr2[0]);
		System.out.println("arr2의 두번째 원소 = " + arr2[1]);
		System.out.println("arr2의 세번째 원소 = " + arr2[2]);
		System.out.println("arr2의 네번째 원소 = " + arr2[3]);
		System.out.println("arr2 배열 전체 원소 갯수 = " + arr2.length);

		// 2. 배열만 선언하고 나중에 초기값 넣는 방법
		int[] arr3;
		arr3 = new int[] {5,6,7,8,9};
		System.out.println("arr3의 첫번째 원소 = " + arr3[0]);
		System.out.println("arr3의 두번째 원소 = " + arr3[1]);
		System.out.println("arr3의 세번째 원소 = " + arr3[2]);
		System.out.println("arr3의 네번째 원소 = " + arr3[3]);
		System.out.println("arr3의 네번째 원소 = " + arr3[4]);
		System.out.println("arr3 배열 전체 원소 갯수 = " + arr3.length);
		
		// 3. 배열 원소의 값이 없는 배열 크기만 생성
		int[] arr4 = new int[4];
		arr4[0] = 10;
		arr4[1] = 20;
		arr4[2] = 30;
		arr4[3] = 40;
		System.out.println("arr4 배열 전체 원소 갯수 = " + arr4.length);
	}

}












