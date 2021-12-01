package p04.hashset_ex2;

// Hash Function : 
// 1. 입력데이터를 받아 hash code값을 return 하는 함수을 말함
// 2. 어떠한 크기의 입력 데이터라도 정해진 크기의 값 (hash code)으로 변환하는 함수를 말함
// 3. 개인정보 등 데이터를 암호화하는 기법 중의 하나임
// 4. Java가 Heap Memory의 객체의 주소를 hash 함수를 사용하여 hash code로 변환하여 표현함
// 5. Heap Memory의 객체의 실제의 여러개의 주소가 한 개의 hash code값으로 변환될 수 있음 (m : 1) 관계 
// [Hash Code method 의미 및 사용법]
// 1. Object class 에서는 주소 개념으로 사용 (System.identityHashCode Method 사용결과와 동일)
// [HashSet class의 hash 함수 사용]
// 1. 원소를 add할 때 동일한 원소가 중복되어 입력된 것인지의 판단 기준은 hashCode() Method의 결과값과 
//    equals method의 결과값으로 이중 체크하여 판단함.
import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		Member m1 = new Member("홍길동", 30);
		Member m2 = new Member("홍길동", 30);
//		String name1 = "김길동";
//		String name2 = "김길동";
		
//		System.out.println(System.identityHashCode(name1));
//		System.out.println(System.identityHashCode(name2));
		
//		System.out.println(System.identityHashCode(m1));
//		System.out.println(System.identityHashCode(m2));
//		System.out.println(m1);
//		System.out.println(m2);
//		System.out.println(m1.hashCode());
//		System.out.println(m2.hashCode());
		
		set.add(m1);
		set.add(m2);
		
		System.out.println("총 원소수 : " + set.size());
	}
}
