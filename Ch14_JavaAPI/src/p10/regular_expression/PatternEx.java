package p10.regular_expression;

import java.util.regex.Pattern;

// regular expression "(02|010)-\\d{3,4}-\\d{4}" 설명 => 전화번호를 찾는 정규표현식
// 1. (02|010) : 02 또는 010, () : grouping, | : or
// 2. \\ => \와 같은 의미, 예, 문자열 안에 있는 "\\d{3,4}" 의미는 정규표현식 \{3,4}와 같은 의미
// 3. d{3,4} => d는 [0-9] 숫자, {3,4} 숫자 갯수가 최소 3개에서 최대 4개
// 4. d{4} => 숫자 4개

// regular expression "\\w+@\\w+\\.\\w+(\\.\\w+)?" 설명  => email 주소를 찾는 정규표현식
// 1. \w+ : word가 1개 이상 (+가 1개 이상) (예: 1234, ab1c2deAA4_rfj)
// 2. \. => 문자 . 의미 ( . 의미 : 모든 문자 1개)
// ? : 없거나 1개만 존재
public class PatternEx {

	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-5678";
		boolean result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.co.kr";
		result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
	}

}
