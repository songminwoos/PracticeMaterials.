package p05.hashmap_ex2;
/*
 key의 중복 체크 : equals method와 hashCode 메소드의 결과값으로 체크
 */
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);		
		map.put(new Student(1, "홍길동"), 92);
		
		System.out.println("총 Entry 수 : " + map.size());
		
	}

}
