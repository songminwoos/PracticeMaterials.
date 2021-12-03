package p05.console;

import java.io.Console;

// Console Class : FileInputStream class를 대체하는 새롭게 만든 클래스 (java 1.6부터 지원) 
public class ConsoleEx {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println("아이디: ");
		String id = console.readLine();
		
		System.out.println("패스워드: ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("--------------------");
		System.out.println(id);
		System.out.println(strPassword);
		
	}

}
