package p11.arrays_method;

public class Member implements Comparable<Member> {
	String name;
	
	Member(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		 return name.compareTo(o.name); 		// 오름차순 정렬
		//return -name.compareTo(o.name); 		// 내림차순 정렬
		//return o.name.compareTo(name); 			// 내림차순정렬
	}

}

