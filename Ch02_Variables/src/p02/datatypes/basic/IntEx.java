package p02.datatypes.basic;

// int 타입에정수 리터럴 사용 방법
// 1. 10진수, 8진수, 16진수 등을 사용 가능
// 2. 10진수, 16진수(하드웨어와 연계된 프로그램, 통신프로그램)를 많이 사용
public class IntEx {

	public static void main(String[] args) {
		int var1 = 10;	// 10진수
		int var2 = 012;	// 8진수 0 (octal) => 1*8**1 + 2*8**0 => 8 + 2 = 10
		int var3 = 0xA;	// 16진수 0x (x : hexa decimal)

		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
	}

}
