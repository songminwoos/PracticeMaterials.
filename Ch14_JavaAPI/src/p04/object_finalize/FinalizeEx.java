package p04.object_finalize;

// 1. garbage(쓰레기) 정의
//   - heap memory에서 인스턴스로 생성이 되어 있지만, stack등의 변수등으로 null로 초기화되어 사용할 수 없는 인스턴스 들
// 2. garbage collector(청소부) S/W
//   - JVM안에 구현된 SW로 힙메모리에서 stack등의 변수에서 사용되지 않고 놀고 있는 인스턴스를 힙메모리에서 제거하는데
//     일반 application과 독립적으로 JVM 관할에서 독립적으로 실행
// 3. System.gc() 메소드 : 일반 application에서 gc()메소드를 실행하면, JVM안에 있는 garbage collector SW에게
//                        지금 힙메모리에 있는 쓰레기를 가능한한 빨리 처리해달라고 요청
// 4. finalize method 실행 : garbage collector가 실제로 힙메모리에 있는 인스턴스를 삭제하기 직전에 finalize 메소드 실행
//    - application에서 활용하는 방법 및 목적 : 실제로 인스턴스가 힙메모리에서 삭제되기 전에, 프로그램에서 정리하기 위해 사용
//      => 사용 예 : 하드디스크의 file을 생성해서, 해당 인스턴스의 필드등의 최종 정보를 저장, 
public class FinalizeEx {

	public static void main(String[] args) {
		Employee emp;
		
		emp = new Employee(1);
		emp = null;
		emp = new Employee(2);
		emp = null;
		emp = new Employee(3);
		emp = null;
		emp = new Employee(4);

		System.out.println("emp가 최종적으로 참조하는 사원번호: " + emp.id);
		
		System.gc();
	}

}
