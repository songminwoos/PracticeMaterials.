package p02.datatypes.promotion;

public class PromotionEx {

	public static void main(String[] args) {
		byte byteValue = 10;	// byteValue의 메모리 방크기 : 1byte
		// 기계어로 실행될 때
		// 1. byteValue의 방크기를 1byte에서 4bytes로 자동 변환 (promotion)
		// 2. 4bytes 크기로 자동 변환된 byteValue의 값을 intValue에 저장
		int intValue = byteValue;
		System.out.println("intValue = " + intValue);
		
		char charValue = '가';	// charValue의 메모리 방크기 : 2bytes
		// 기계어로 실행될 때
		// 1. charValue의 방크기를 2bytes에서 4bytes로 자동 변환 (promotion)
		// 2. 4bytes 크기로 자동 변환된 charValue의 값을 intValue에 저장
		intValue = charValue;
		System.out.println("intValue = " + intValue);
		
		intValue = 500;
		// 기계어로 실행될 때
		// 1. intValue의 방크기를 4bytes에서 8bytes로 자동 변환 (promotion)
		// 2. 8bytes 크기로 자동 변환된 intValue의 값을 longValue에 저장
		long longValue = intValue;
		System.out.println("longValue = " + longValue);
		
		intValue = 200;
		double doubelValue = intValue;
		System.out.println("doubelValue = " + doubelValue);
	}

}













