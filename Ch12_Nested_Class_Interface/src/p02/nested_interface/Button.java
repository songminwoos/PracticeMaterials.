package p02.nested_interface;

public class Button {
	OnClickListener listener;
	
	// setter method
	// child instance를 부모 interface로 자동형변환(promotion)
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();		// polymorphism
	}

	interface OnClickListener {
		void onClick();		// abstract method
	}
}
