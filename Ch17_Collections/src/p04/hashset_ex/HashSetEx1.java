package p04.hashset_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// set : 원소가 중복되어 저장될 수 없음.
public class HashSetEx1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");       // add method가 중복된 원소를 추가하여도 별도의 에러가 나지 않는다.
		set.add("iBatis");
		
		int size = set.size();
		System.out.println("총 원소수 : " + size);
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
		
		System.out.println();
		
		// 향상된 for문 사용 (set)
		for (String e : set) {
			System.out.println(e);
		}
	}

}
