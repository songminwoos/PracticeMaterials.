package p02.call_by_reference.practice;

// 배열 원소의 값을 reverse로 만드는 예제
// 예 : arr=[1,2,3,4] => arr=[4,3,2,1]
public class ArrayReverse3 {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};

		reverse(list);
		for (int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void reverse(int[] list) {
		int[] newList = new int[list.length];
		
		// parameter로 넘어온 list배열 전체를 newList에 copy
		for (int i=0; i<list.length; i++) {
			newList[i] = list[i];
		}
		// list 원소에 reverse값 할당
		for (int i=0; i<list.length; i++) {
			list[i] = newList[list.length - 1 -i];
		}		
	}
}











