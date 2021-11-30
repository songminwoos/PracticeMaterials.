package p11.arrays_method;

import java.util.Arrays;

// 정렬 예제 : 
// Arrays의 sort method : array 원소의 값을 기준으로 오름차순으로 정렬
// 1. parameter로 int[], Object[]등 다양한 data type을 지정 가능 => method overload 사용
// 2. sort method를 사용할려면, 반드시 Comparable interface를 implement를 한 class로 사용해야 함
//	   - 단, int, float, double등 primivive type은 Comparable interface를 implement할 필요 없음
// 3. a.compareTo(b)의 return 값이 나오게 만들면 오름차순으로 정렬(sorting)
//     1) a < b 이면, -1 return (-1을 return할 경우에는 a, b의 순서를 유지하도록 코딩되어 있음)
//     2) a = b 이면, 0 return (0을 return 할 경우에는 a, b의 순서를 유지하도록 코딩되어 있음)
//     3) a > b 이면, 1 return (1을 return 할 경우에는 a, b의 순서를 바꾸도록 코딩되어 있음)
// 4. a.compareTo(b)의 return 값이 나오게 만들면 내림차순으로 정렬(sorting)
//		1) a < b 이면,   1 return
//		2) a == b 이면, 0 return
//     3) a > b 이면,   -1 return
// 5. String의 a.compareTo(b) method return 값 예제
//    - 가나다, 알파벳 순서로 소팅
//    1) "김길동" < "나한수" 이면, -1 return
//    2) "김길동" == "김길동" 이면, 0 return
//    3) "나한수" > "김길동", 이면,  1 return
// 6. Member class의 a.compareTo(b) method return 값
//    - String type의 name 변수를 사용하여 String class의 method인 compareTo를 사용
//	    => Member class는 name 문자열 순서로 정렬
public class SortEx {

	public static void main(String[] args) {
		int[] scores = { 99, 95, 44, 97, 98 };

		// 정렬전 scores 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}

		System.out.println();

		Arrays.sort(scores);

		// 정렬후 scores 출력
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "]=" + scores[i]);
		}

		System.out.println();
		
		String[] names = { "홍길동", "빅동수", "김민수" };
		Arrays.sort(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] = " + names[i] + "");
		}

		System.out.println();

		Member[] members = { new Member("홍길동"), new Member("박동수"), new Member("김민수") };
		Arrays.sort(members);
		for (int i = 0; i < members.length; i++) {
			System.out.println("members[" + i + "].name = " + members[i].name);
		}
	}
}
