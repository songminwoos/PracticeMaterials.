package p02.datatypes.basic;

// 정수 리터럴값 : 기본적으로 4bytes에 저장 (예: 5는  0000 0000 0000 0000 0000 0000 0000 0101의 메모리 공간에 저장)
// long 리터럴값 : 8bytes에 저장 (예 : 5L은 8bytes의 메모리 공간에 저장
public class LongEx {

	public static void main(String[] args) {
		// 기계어 코드로 변환
		// 1. int 타입의(4bytes) 정수값(리터럴)을 먼저 임시저장장체에 생성
		// 2. var1의 타입이 long이기 때문에 4bytes 리터럴 정수값을 8bytes 크기의 방으로 변환
		//     => 4bytes 정수 리터럴를 8bytes로 Java에서 자동으로 크기 변경 (promotion이라 함)
		// 3. var1 변수에 변환된 8bytes의 리터럴 정수값을 넣어줌
		long var1 = 10;	// 10을 4bytes 크기의 값으로 저장
		long var2 = 20L;// L :long, 20L 리터럴값에서  
//		long var3 = 1000000000000;
		long var4 = 1000000000000L;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var4 = " + var4);
	}

}
