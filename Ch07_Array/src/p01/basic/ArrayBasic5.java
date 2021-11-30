package p01.basic;

// 배열 원소의 type이 char인 경우
// 1. char[] 배열인 경우 string(문자열)으로 출력하고 싶은 경우는 System.out.print 또는 System.out.println 사용
public class ArrayBasic5 {

	public static void main(String[] args) {
		char[] city = {'D', 'a', 'l', 'l', 'a', 's'};
		
		for (char element : city) {
			System.out.println(element);
		}

		System.out.println(city);
	}

}
