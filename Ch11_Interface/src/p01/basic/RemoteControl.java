package p01.basic;

public interface RemoteControl {
//	public static final int MAX_VOLUME = 10;	//상수
	int MAX_VOLUME = 10;						//상수
	public int MIN_VOLUME = 0;

	// abstract method
	public abstract void turnOff();
	void turnOn();
	public void setVolume(int volume);
	
}
