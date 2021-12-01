package p02.arraylist_collections_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Collections class의 Method 사용법
// 1. max() method : 원소 중에 최대값 구하는 Method
// 2. min() method : 원소 중에 최소값 구하는 Method 
// 3. sort() method : 오름차순 정렬
// 4. binarySearch() : 찾고자 하는 원소의 index값을 return하는 메소드
// 5. disjoint(a, b) method : a와 b list의 원소가 서로 하나라도 중복되지 않으면 true, 하나라도 중복되면 false return
// 6. copy(dest, source) method :  source의 원소들을 dest의 원소들로 대체하면서 copy함
// 7. reverse method : 원소들의 순서들을 뒤집어 놓는 메소드
public class ColletionsClassEx {

	public static void main(String[] args) {
		Integer[] numbers = {1123, 1412, 23, 44, 512132};
		List<Integer> list = Arrays.asList(numbers);

		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println(Collections.binarySearch(list, 44));
		
		Collections.sort(list); // 오름차순
		Collections.reverse(list); // reverse()를 사용하여 내림차순의 효과를 얻을 수 있음
		System.out.println(list);
		
		List<Integer> list1 = Arrays.asList(121, 2353, 123, 1, 41234);
		System.out.println(Collections.disjoint(list, list1));
		
		List<Integer> source = new ArrayList<Integer>();
		source.add(100);
		source.add(23);
		
		Collections.copy(list1, source);
		System.out.println(list1);
		
		Collections.reverse(list1);
		System.out.println(list1);
	}

}
