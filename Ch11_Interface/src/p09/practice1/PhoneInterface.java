package p09.practice1;

public interface PhoneInterface {

	final static int TIMEOUT = 10000;

	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("** Phone **");
	}	
}
