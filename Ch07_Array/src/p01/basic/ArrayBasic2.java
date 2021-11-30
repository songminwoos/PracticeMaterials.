package p01.basic;

// array에서 for문 사용 (while, do~while등 반복문에서도 같음)
// 1. 배열에서 for문을 사용하여 코딩양을 대폭 줄일 수 있음
//    - 배열 원소의 시작 index 값 : 0, 배열 마지막 원소의 index값 = arr.length - 1 
//    - 배열 원소의 갯수가 변동이 생겨도 for문 자체 코딩을 수정할 일은 없음
// 2. 향상된 for문 (improved for statement)
//    - for문을 간략화 (javascript, python등 다른 언어에서 기능이 구현되어 있음)
//    - array뿐만 아니라 배열과 유사하게 여러개의 데이터를 동시에 관리하는 
//      다른 type들(collection과 관련된 class들이 있음)에도 동시에 적용 가능
public class ArrayBasic2 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		double[] arr2 = {1.0, 2.0, 3.0, 4.0};

		for (int i=0; i<arr.length; i++) {
			System.out.println("arr[" +i + "] = " + arr[i]);
		}

		for (int i=0; i<arr2.length; i++) {
			System.out.println("arr2[" +i + "] = " + arr2[i]);
		}
		
		// element : arr배열의 원소값을 저장하는 임시변수 => arr 원소 갯수만큼 for문이 반복 실행됨 
		// 1. int element : arr는  => int i=0; i<arr.length; i++ 와 동일함
		// 2. element는 arr[i]
		for (int element : arr) {
			System.out.println(element);
		}

		for (double elem : arr2) {
			System.out.println(elem);
		}
	}

}







