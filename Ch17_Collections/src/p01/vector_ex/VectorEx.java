package p01.vector_ex;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		v.add(5);               // add : 원소 추가하는 메소드
		v.add(4);
		v.add(-1);
		
		for (int i=0; i <v.size(); i++) {
			int n = v.get(i);   // get : 원소를 가져오는 메소드
			System.out.println(n);
		}
		
		v.add(1, 100);          // 기존 원소 사이에 삽입 가능한데, 삽인된 index 이후의 기존에 있는 원소들이 index가 1씩 증가.
		
		for (int i=0; i <v.size(); i++) {
			int n = v.get(i);   // get : 원소를 가져오는 메소드
			System.out.println(n);
		}
		
		System.out.println("원소 갯수 : " + v.size());
		// capacity() : vector가 담을 수 있는 현재 최대 원소 갯수
		System.out.println("vector 전체 크기 : " + v.capacity());
		
		
		for (int i=0; i<10; i++) {
			v.add(i+10);
		}
		
		System.out.println("원소 갯수 : " + v.size());
		System.out.println("vector 전체 크기 : " + v.capacity());
		
		// 향상된 for문 사용 가능 (Collections에서 사용하기 위해 만듬)
		for(int i : v) {
			System.out.println("원소 : " + i);
		}
	}

}
