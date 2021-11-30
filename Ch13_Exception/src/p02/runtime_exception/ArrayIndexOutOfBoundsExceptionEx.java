package p02.runtime_exception;

// ArrayIndexOutOfBoundsException 발생
// - args[0], args[1]에 값이 없는 발생하는 에러
public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
//		int[] a = {1,2,3};
//		
//		System.out.println(a[0]);
//		System.out.println(a[1]);
//		System.out.println(a[2]);
//		System.out.println(a[3]);

		String data1 = args[0];
		String data2 = args[1];
		
		System.out.println("args[0] = " + data1);
		System.out.println("args[1] = " + data2);

	}

}
