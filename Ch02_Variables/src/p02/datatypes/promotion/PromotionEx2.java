package p02.datatypes.promotion;

public class PromotionEx2 {

	public static void main(String[] args) {
		int baseInterestRate = 3;	// 이자율 3%
		
		// 4 bytes => 8bytes 변경되어 newInterestRate에 값이 들어감 (자동형변환, promotion)
		long newInterestRate = baseInterestRate;
		
		// long type 8bytes => 4 bytes float type 변경 가능 (자동 형변환, promotion)
		// 비록 float type이 4bytes이지만, long의 최대값이 float의 최대값보다 작아, 자동형변환 허용 해줌
		float japanInterestRate = newInterestRate;

	}

}
