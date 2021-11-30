package p02.call_by_reference.practice;

// swap(a[0], a[1])가 swap(int n1, int n2)을 부를 경우, n1, n2에는 배열원소의 값인 a[0], a[1]이 넘어감
// - 여기서, a[0], a[1]의 데이터 타입은 primitive인 int 타입이어서, 값이 넘어감
public class TestPassArray {

	public static void main(String[] args) {
		int[] a = {1, 2};
		
		System.out.println("swaping 이전");
		System.out.println("a[0] = " + a[0] + ", a[1] = " + a[1]);
		
		swap(a[0], a[1]);
		System.out.println("배열 원소값을 넘기는 swap 메소드 호출 이후");
		System.out.println("a[0] = " + a[0] + ", a[1] = " + a[1]);

		swapInArray(a);
		System.out.println("배열을 넘기는 swap 메소드 호출 이후");
		System.out.println("a[0] = " + a[0] + ", a[1] = " + a[1]);
	}

	public static void swap(int n1, int n2) {
		int temp = n1;
		n1 = n2;
		n2 = temp;
	}
	
	public static void swapInArray(int[] num) {
		int temp = num[0];
		num[0] = num[1];
		num[1] = temp;
	}
	
}
