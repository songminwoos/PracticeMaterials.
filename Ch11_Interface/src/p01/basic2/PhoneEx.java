package p01.basic2;

// Interface 사용 용도
// 1. SW 솔루션 업체에서 고객들에게 제공하는 사용 설명서
//   - 예를 들면, google에서 android OS 신버젼을 만들고 난 후, 삼성, LG, 휴대폰 제조업체에게 Interface를 제공해줌
//   - 삼성 등 각 제조업체는 google에서 제공한 Interface를 구현한 class를 만들면, android OS 신버젼을 사용할 수 있음
//   - 삼성 등 Interface와 관련하여 구현할 내용 : 삼성 폰 HW 사양과 android OS를 접목시키기 위한 내용
public class PhoneEx {

	public static void main(String[] args) {
		Phone phone = new SamsungPhone();
//		phone = new LGPhone();
//		phone = new ApplePhone();
		
		phone.sendCall();
		phone.receiveCall();

//		SamsungPhone sp = (SamsungPhone) phone;
//		sp.flash();
	}

}
