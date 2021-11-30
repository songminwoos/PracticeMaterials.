package p02.anonymous_instance;

// 익명객체 (Anonymous Instance)
// 1. Interface를 implement한 인스턴스를 만들 때 사용 (class로 선언하지 않고, 1회용으로 사용하고자 사용)
// 2. 사용 예 : 안드로이드 앱 프로그래밍에서 사용
public class RemoteEx {

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			int volume;
			
			@Override
			public void turnOn() {
				System.out.println("Anonymous(익명) 객체 - 전원 킵니다.");
			}			
			@Override
			public void turnOff() {
				System.out.println("Anonymous(익명) 객체 - 전원 끕니다.");
			}
			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("Anonymous(익명) 객체 - volume = " + this.volume);
			}
		};
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

}
