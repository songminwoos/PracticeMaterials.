package p02.runtime_exception;

// Integer.parseInt(String data) => 문자열 입력 parameter data를 int 정수 타입으로 변환
// - data 문자열이 숫자로 변환할 수 없으면 NumberFormatException 발생시킴
// - 예를 들면, data가 "100"인 경우, 정수 100을 return하나, 
//            "a100"처럼 숫자로 변환할 수 없는 문자열인 경우 NumberFormatException 발생 시킴
public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";
		
		int val1 = Integer.parseInt(data1);
		int val2 = Integer.parseInt(data2);

		int result = val1 + val2;
		System.out.println(data1 + " + " + data2 + " = " + result);
	}

}
