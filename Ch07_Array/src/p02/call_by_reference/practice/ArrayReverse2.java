package p02.call_by_reference.practice;

// 배열 원소의 값을 reverse로 만드는 예제
// 예 : arr=[1,2,3,4] => arr=[4,3,2,1]
//reverse method가 제대로 동작되지 않음
public class ArrayReverse2 {

	public static void main(String[] args) {
		int[] list = {1, 2, 3, 4, 5};

		System.out.println("list 주소 = " + System.identityHashCode(list));
		reverse(list);
		System.out.println("reverse method 호출후의 list 주소 = " + System.identityHashCode(list));
		for (int i=0; i<list.length; i++) {
			System.out.print(list[i] + " ");
		}
	}

	public static void reverse(int[] list1) {
		int[] newList = new int[list1.length];
		System.out.println("newList 주소 = " + System.identityHashCode(newList));
		System.out.println("reverse method의 List 주소 = " + System.identityHashCode(list1));
		
		for (int i=0; i<list1.length; i++) {
			newList[i] = list1[list1.length - 1 -i];
		}
		
		list1 = newList;		
	}
}











