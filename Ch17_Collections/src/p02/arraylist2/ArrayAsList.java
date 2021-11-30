package p02.arraylist2;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동", "김자바", "신용권");
		
		for (String name : names) {
			System.out.println(name);
		}
		
		List<Integer> numbers = Arrays.asList(1,2,3);
		// Integer 인스턴스를 int Primitive 타입으로 auto unboxing
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
