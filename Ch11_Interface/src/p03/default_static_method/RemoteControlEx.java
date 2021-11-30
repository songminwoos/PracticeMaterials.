package p03.default_static_method;

// [Interface default method]
// 1. Interface에서 default method 선언할 때 반드시 default 키워드를 넣어야 함. 
//    => default 키워드를 빼면 추상메소드로 인식하기 때문임
//    => 참고로, class에서는 메소드 선언할 때 기본이 default여서, default 키워드를 쓰지 않음
// 2. 자식 클래스에서 부모 Interface의 default method를 override(재정의)할 경우 default로 쓰고 싶으면
//    default 키워드를 제거해야 함
// [Interface static method]
// 1. Interface이름으로 static method 사용 가능
public class RemoteControlEx {

	public static void main(String[] args) {
		RemoteControl rc;

		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.setMute(true);
		rc.turnOff();

		RemoteControl.changeBattery();
		
		rc = new Audio();
		
		rc.turnOn();
		rc.setVolume(7);
		rc.setMute(false);
		rc.turnOff();
	}

}
