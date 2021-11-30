package p01.practice;

// 학생별 성적 매기기 예제
// 1. 문제 수 : 10문제
public class GradeExam {

	public static void main(String[] args) {
		char[][] student_answers = {
				{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},	// 첫번째 학생이 제출한 정답
				{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},	// 두번째 학생이 제출한 정답
				{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},	// 세번째 학생이 제출한 정답
				{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},	// 네번째 학생이 제출한 정답
				{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}	// 다섯번째 학생이 제출한 정답
		};
		char[] answers = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
		
		// 5명 학생 성적 구하기
		for (int i=0; i <student_answers.length; i++) {
			int correctCount = 0;
			for (int j=0; j<student_answers[i].length;j++) {
				if (student_answers[i][j] == answers[j]) {
					correctCount++;
				}
			}
			System.out.println("학생 번호 " + i + "의 맞은 총 갯수는 " + correctCount + "입니다.");
		}
	}

}




