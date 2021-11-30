package p05.system_class;

// System.exit(int status) method
// 1. 사용 목적 : 프로그램 강제 종료
// 2. exit method의 paramter status의 값의 의미
//    - 통상 status가 0이면 정상으로 프로그램 종료한다는 의미
//    - status가 0이 아닌 다른 정수라면 프로그램이 비정상적으로 종료되었다고 의미
//    - Java의 System.exit()메소드는 status 정수값이 어느 값이 오더라도 프로그램 종료
// 3. System.setSecurityManager 메소드를 통해 status값이 특정 정수값이 경우만 프로그램이 강제 종료하도록 코딩 가능
//    - 방법 : SecurityManager class의 익명객체를 setSecurityManager의 parameter로 넘기고,
//            setSecurityManager 익명객체의 checkExit을 override하여 코딩하면 됨
//    - checkExit을 override하여 코딩하는 이유 : 
//      => exit 메소드를 실행하면 Java가 시스템을 강제종료하기 이전에 checkExit()메소드를 자동 실행함 
public class ExitEx {

	public static void main(String[] args) {
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});

		for (int i=0; i<10; i++) {
			System.out.println(i);
			
			try {
				System.exit(i);
			} catch (SecurityException e) {
				System.out.println("SecurityException 인스턴스 호출됨");
			}
			
		}
	}

}
