package p04.anonymous_interface2;

// 1. field로 Button class의 인스턴스인 btn1, btn2를 선언
// 2. Button class의 내부 인터페이스인 OnClickListener의 변수에, OnClickListener 인터페이스의 자식 인스턴스를 만듬
public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	Button.OnClickListener listener = new Button.OnClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
		}
	};

	// 기본 생성자
	public Window() {
		// btn1은 listener라는 OnClickListener 인터페이스의 자식 인스턴스 변수 사용
		btn1.setListener(listener);
		btn2.setListener(new Button.OnClickListener() {
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		});	
	}
	
}




