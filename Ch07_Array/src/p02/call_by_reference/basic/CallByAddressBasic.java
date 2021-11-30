package p02.call_by_reference.basic;


// Stack memeory의 Action Record에서 primitive type 변수와 참조 type 변수의 실제 값
// 1. Primitive type 변수 : stack memory안에 실제 값을 저장
// 2. 참조 type 변수 : stack memory안에 heap memory의 주소를 저장
//                   - CPU는 heap memory의 주소를 읽어서, 해당 주소에 저장된 값을 읽음
//                   - System.identityHashCode method는 JVM이 관리하는 메모리 주소 값을 return
// 3. Stack memory에서 참조타입 변수인 경우의 메모리에 있는 내용이 값이 아니라 heap memory의 주소를 저장하는 이유
//    => 참조타입 변수에 해당하는 데이터 타입들은 모두 데이터를 저장하는 메모리 공간이 가변적인 특징이 있음
//    => 주소값을 저장하는 메모리 크기 : 32bit CPU인 경우는 4 bytes, 64bits CPU인 경우는 주소가 8bytes
public class CallByAddressBasic {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 10;
		String name = "honggildong";
		int[] arr =  {1,2,3};
		int[] arr1 = {1,2,3};
		
		System.out.println("1과 10사이의 합 = " + sum(1, 10));
		
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);

		System.out.println("arr = " + arr);	// 16진수
		System.out.println("arr1 = " + arr1);
		System.out.println("name = " + name);
		System.out.println(System.identityHashCode(arr));	// 10진수
		System.out.println(System.identityHashCode(arr1));
		System.out.println(System.identityHashCode(name));

	}

	public static int sum(int startValue, int endValue) {
		int result = 0;
		
		for (int i=startValue; i<=endValue; i++) {
			result = result + i;
		}
		
		return result;
	}

}
