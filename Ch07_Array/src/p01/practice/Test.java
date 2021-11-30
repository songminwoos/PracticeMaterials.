package p01.practice;

public class Test {

	public static void main(String[] args) {
		String hello = "Hello";
		String hello1 = "Hello";
		int[] arr = {1,2,3,4};
		int[] arr1 = {1,2,3,4};

		System.out.println(System.identityHashCode(hello));
		System.out.println(System.identityHashCode(hello1));
		System.out.println(System.identityHashCode(arr));
		System.out.println(System.identityHashCode(arr1));
		System.out.println(arr);
		System.out.println(arr1);
	}

}
