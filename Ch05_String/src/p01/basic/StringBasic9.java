package p01.basic;

// 문자열에서 찾는 문자열 또는 Character 의 첫번째 글자의 index 값 가져오기
// 1. indexOf(char or String, startIndex) : 문자열의 찾는 문자나 문자열의 첫번째 index값을 가져옴
//      - startIndex부터 찾아라. (기본은 index 0부터 찾음)
//      - 정상적으로 찾으면 시작 index값을 가져옴
//      - 찾지 못하면 -1을 가져옴
//      - 문자나 문자열을 찾을 때 대소문자 구분하여 찾음
// 2. lastIndexOf(char or String, startIndex) : 문자열의 찾는 문자나 문자열의 첫번째 index값을 가져옴
//      - 기본이 마지막 index부터 찾음)
public class StringBasic9 {

	public static void main(String[] args) {
		System.out.println("Welcome to Java".indexOf('W'));
		System.out.println("Welcome to Java".indexOf('o'));
		System.out.println("Welcome to Java".indexOf('o', 5));
		System.out.println("Welcome to Java".indexOf("come"));
		System.out.println("Welcome to Java".indexOf("comet"));
		System.out.println("Welcome to Java".indexOf("Java", 5));
		System.out.println("Welcome to Java".indexOf("java", 5));
		System.out.println("Welcome to Java".toUpperCase().indexOf("JAVA", 5));
		System.out.println("WELCOME TO JAVA".indexOf("JAVA", 5));
		
		System.out.println();

		System.out.println("Welcome to Java".lastIndexOf('W'));
		System.out.println("Welcome to Java".lastIndexOf('o'));
		System.out.println("Welcome to Java".lastIndexOf('o', 5));
		System.out.println("Welcome to Java".lastIndexOf("come"));
		System.out.println("Welcome to Java".lastIndexOf("comet"));
		System.out.println("Welcome to Java".lastIndexOf("Java", 5));
		System.out.println("Welcome to Java".lastIndexOf("java", 5));
}

}
