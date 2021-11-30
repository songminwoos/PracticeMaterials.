package p03.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// 1. LinkedList는 원소가 빈번히 삭제되는 application에 사용하는 것을 권장.
// 2. ArrayList는 원소가 빈번히 삭제되는 application에서는 원소가 많아져서 속도가 느려지는 단점이 있음.
//  => 원소 새로 추가 후 조회가 많은 application에서 사용하는 것을 권장
//  => Vector보다는 ArrayList가 처리속도가 더 빨라 많이 사용되고 있음.
public class LinkedListEx {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린 시간 : " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for (int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간 : " + (endTime-startTime) + " ns");
		
	}

}
