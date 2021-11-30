package p01.escape_seq;

// 1. 키보드에서 enter key를 누르면 \n\r escape 문자가 2개  발생
public class EscapeSequenceEx {

	public static void main(String[] args) {
		// \n : keyborad의 enter key 역할 (n : newline)
		System.out.println("\n줄 바꿈\n연습 \n");
		System.out.println("\t탭키\t연습 \n");
		// \r : 해당 라인의 첫번째 문자 위치로 이동
		System.out.println("이것을\r덮어씁니다 \n");
		System.out.println("글자가 \"강조\"되는 효과 \n");
		System.out.println("\\\\\\ 역슬래시 세개 출력 \n");
		System.out.println("Good Morint\bg Everyone.");
	}

}
