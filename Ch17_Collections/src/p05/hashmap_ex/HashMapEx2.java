package p05.hashmap_ex;
/*
 String인  경우의 key가 중복인지 아닌지 체크
 1. 문자열이 같으면 equals()와 HashCode() 메소드 값이 동일 
 (예를 들면, "홍길동"이라는 문자열이 key로 사용할 경우, equals()와 HashCode() 메소드 값이 동일
 2. 중복된 키값으로 put을 사용하여 새로 입력하면, 키는 변경이 없지만 값은 새로운 값으로 변경
 3. key와 value를 가져오는 방법
  1) keySet() 메소드를 통해 key값들을 Set 객체로 가져오고, 그 다음에 각 key를 통해 value를 가져오는 방법
  (Iterator 사용방법)
  2) keySet() 메소드를 통해 key값들을 Set 객체로 가져오고, 향상된 for문을 사용하여value를 가져오는 방법
 4. forEach 메소드 사용 (Java 1.8부터 지원)
  - forEach 메소드의 parameter로 람다 표현식 사용 가능
  - 예 : (key, value) -> {System.out.println("람다방식 key : " + key + "value : " + value)
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		map.put("홍길동", 75);
		
		System.out.println("총 entry 수 : " + map.size());
		
		System.out.println("홍길동 점수 : " + map.get("홍길동"));
		
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 entry 수 : " + map.size());
		
		// 첫번째 방법 : key, value 가져오기
		Set<String> keySet = map.keySet();
		Iterator<String> keyIt = keySet.iterator();
		while (keyIt.hasNext()) {
			String key = keyIt.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + "value : " + value);
			
		}
		System.out.println();
		
		// 두번째 방법 : key, value 가져오기 (향상된 for문 사용)
//		keySet = map.keySet();
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println("key : " + key + "value : " + value);
		}
		System.out.println();
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		
		// 세번째 방법 : entrySet을 통해 key, value 가져오는 방법
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key : " + key + "value : " + value);
		}
		
		System.out.println();
		
		// 네번째 방법 : ForEach 메소드 : parameter로 람다표현식 사용 (forEach 메소드는 Java1.8부터 사용가능)
		map.forEach((key, value) -> {System.out.println("람다방식 key : " + key + "value : " + value);});
		
		System.out.println();
		
		// 전체 entry 삭제
		map.clear();
		System.out.println("총 entry 수 : " + map.size());
	}

}
