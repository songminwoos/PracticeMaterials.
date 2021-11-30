package p09.practice1;
/*
 SmartPhone class 의 부모는 PDA class
 SmartPhone class는 MobilePhoneInterface, MP3Interface를 implement 하였음
 */
public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("따르릉 따르릉~~");
	}

	@Override
	public void receiveCall() {
		System.out.println("전화 왔습니다.");
	}

	@Override
	public void play() {
		System.out.println("음악을 시작합니다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 끕니다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("메세지를 보냅니다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("메세지가 도착했습니다.");
	}
	public void schedule() {
		System.out.println("일정관리 합니다.");
	}

}
