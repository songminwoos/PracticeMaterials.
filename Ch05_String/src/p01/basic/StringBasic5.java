package p01.basic;

// String 문자열 합치기 연산자인 '+'에 대하여 상세 실습
// 1. String 자동형변환 
//   - String + primitive type => primitive를 string type으로 변경하여 두 개 문자열 합침
//   - 예: "Java" + 5 => "Java" + "5" => "Java5"
//   - 3 + 3 + "Java" => 6 + "Java" => "6" + "Java" => "6Java"
//   - "Java" + 3 + 3 => "Java" + "3" + 3 => "Java3" + 3 => "Java3" + "3" => "Java33"
public class StringBasic5 {

	public static void main(String[] args) {
		String s1 = "Java";
		double pi = 3.14159;
		
		System.out.println("s1의 길이 = " + s1.length());
		s1 = s1 + 5;
		System.out.println("s1의 길이 = " + s1.length());
		System.out.println("s1 문자열 " + s1);

		s1 = s1 + pi;
		System.out.println("s1의 길이 = " + s1.length());
		System.out.println("s1 문자열 " + s1);

		s1 = 3 + 3 + "Java";
		System.out.println("s1 문자열 " + s1);

		s1 = "Java" + 3 + 3;
		System.out.println("s1 문자열 " + s1);
	}

}










