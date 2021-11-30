package p05.system_class;

import java.util.Properties;

// System.getProperty : JVM이 시작할 때 PC의 시스템 설정 정보를 가져오는데, JVM이 설정한 정보를 가져오는 메소드
public class GetPropertyEx {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.home");

		System.out.println("운영체계 이름 : " + osName);
		System.out.println("사용자 이름 : " + userName);
		System.out.println("사용자 홈디렉토리 : " + userHome);
		
//		System.out.println("-------------------------------");
//		System.out.println(" [  key ]     value");
//		System.out.println("-------------------------------");
//		Properties props = System.getProperties();
		
	}

}
