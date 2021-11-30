package p02.object_class_tostring;

import java.util.Date;

// 1. Object class의 toString() 메소드의 return값
// - String 문자열로 리턴 : "package이름@힙메모리주소" 로 표현됨
//   => 예로, obj1의 toString() 결과값은 "java.lang.Object@15db9742"
// - 참고로, println메소드의 패러미터로 obj1을 줄 때, println메소드는 obj1의 class의 toString 메소드를 실행함
// 2. String class의 toString method는 부모인 Object class의 toString메소드를 override하여, 문자열을 리턴하도록 구현함
// 3. System.identityHashCode(obj1.toString())를 기계어코드로 변환할 경우 세부 명령어들 순서
//  - obj1.toString()을 실행 
//    => 문자열 "java.lang.Object@15db9742"이 임시적으로 생기더라도 
//       이 임시 문자열을 힙메모리에 생성하고 임시문자열의 주소를 return
//       => 새로운 문자열 literal이 프로그램 실행 중 발생이 되면 무조건 힙메모리에 새로 올라감 
//  - System.identityHashCode가 임시 문자열의 힙메모리를 주소를 parameter로 입력 받음
//    => identityHashCode()메소드가 임시 문자열의 힙메모리 주소를 integer로 변환하여 return
public class ToStringEx {

	public static void main(String[] args) {
		Object obj1 = new Object();
		String name = "홍길동";
		Date date = new Date();
		
		System.out.println(System.identityHashCode(obj1));	// heap memory 실제 주소의 정수값을 return
		System.out.println(System.identityHashCode(obj1.toString()));
//		String temp = obj1.toString();
//		System.out.println(System.identityHashCode(temp));
		 
		System.out.println(obj1.toString());
		System.out.println(obj1);

		System.out.println(name.toString());
		System.out.println(name);
		
		System.out.println(date.toString());
		System.out.println(date);
	}

}
