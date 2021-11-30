package p05.system_class;
/*
 System.nanoTime : 현재 시간을 nano second (1/1,000,000,000) 단위로 환산한 long type의 정수값 리턴
 1. 사용 용도 : 프로그램내부적으로 실행 소요 시간 계산
 System.currentTimeMills 메소드 : 현재 시가능ㄹ mili second (1/1000) 단위로 환산한 long type 정수값 리턴 
 */
public class SystemTime {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
//		long startTime = System.currentTimeMillis();
		
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum = sum + i;
		}
		long endTime = System.nanoTime();
//		long endTime = System.currentTimeMillis();
		
		System.out.println("sum = " + sum);
		System.out.println("합계 소요 시간(nano seconds) = " +  (endTime - startTime) );
//		System.out.println("합계 소요 시간(mili seconds) = " +  (endTime - startTime) );
	}

}
