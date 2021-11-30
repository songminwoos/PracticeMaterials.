package p05.system_class;

// System.getenv : PC의 시스템 환경(system environment)에 설정된 값들을 읽어오는 메소드
public class SystemEnvironmentEx {

	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		
		System.out.println("JAVA_HOME : " + javaHome);

	}

}
