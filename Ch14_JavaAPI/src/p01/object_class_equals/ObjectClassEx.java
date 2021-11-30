package p01.object_class_equals;

// 1. obj1 == obj2 : false가 나옴
//    - 이유 : obj1, obj2가 각각 new로 생성된 인스턴스가 힙메모리에 다른 주소로 올라가 있기 때문
// 2. obj1.equals(obj2)에서 Object class의 equals method는 obj1 == obj2과 동일하게 구현되어 있음
// 3. == 의미 : stack에서 선언된 변수의 값을 비교
//    3.1 참조타입인 경우는 stack에서 선언된 변수의 값이 힙메모리의 주소여서, ==를 사용할 때 마치 주소를 비교하는 효과를 냄
//        => 예 : obj1의 값과 obj2의 값을 출력
//    3.2 기본타입인 경우 stack에서 선언된 변수의 값이 실제 값이어서 ==를 사용할 때 변수의 값을 비교하는 효과 냄
//        => 예 : x=10, y=10이면 x==y의 실제값이 10==10의 효과를 내어 실제 값이 같은지 비교함
public class ObjectClassEx {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		int x = 10;
		int y = 10;
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		boolean result = obj1.equals(obj2);
		System.out.println("result = " + result);
		
		boolean result1 = (obj1 == obj2);
		System.out.println("result1 = " + result1);

	}

}
