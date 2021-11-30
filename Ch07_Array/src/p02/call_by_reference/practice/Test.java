package p02.call_by_reference.practice;

public class Test {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] arr1 = new int[4];

		// arr1의 주소값을 arr의 주소값으로 변경
		arr1 = arr;
//		for (int i=0; i<arr.length; i++) {
//			arr1[i] = arr[i];
//		}
//		
//		arr1[0] = arr[0];
//		arr1[1] = arr[1];
//		arr1[2] = arr[2];
//		arr1[3] = arr[3];
		
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr1[0] = " + arr1[0]);
	}

}
