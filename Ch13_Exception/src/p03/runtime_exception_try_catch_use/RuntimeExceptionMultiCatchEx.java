package p03.runtime_exception_try_catch_use;

// Runtime Exception 처리 방법
// try ~ catch ~ finally 키워드 사용
// - try : exception없이 정상적으로 처리하고 싶은 내용을 coding
// - catch : exception 발생할 경우에 처리할 내용을 coding
// - finally : 정상이든 exception 발생하든 상관없이 처리할 내용을 coding
//   => finally는 코딩할 때 필요없으면 생략 가능
public class RuntimeExceptionMultiCatchEx {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("프로그램이 정상적으로 실행되고 있습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("Eclipse Run-Run Configuration 메뉴에 들어가서 num1 num2 입력하세요.");
			return;
		}

		try {
			int val1 = Integer.parseInt(data1);	// data1 = "10"
			int val2 = Integer.parseInt(data2); // data2 = "20"
			int result = val1 + val2;
			System.out.println(data1 + " + " + data2 + " = " + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("숫자 덧셈 처리가 종료되었습니다.");
		}
	}

}









