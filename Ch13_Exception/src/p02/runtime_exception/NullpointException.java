package p02.runtime_exception;
/*
 String type의 변수값이 null인 경우( 힙메모리에 문자열이 없는 경우)인  경우
 toString() 메소드로 실행을 하면 NullPointException runtime error 발생
 */
public class NullpointException {
	
	public static void main(String[] args ) {
	String data = null;

	System.out.println(data);
	System.out.println(data.toString());
	}
}
