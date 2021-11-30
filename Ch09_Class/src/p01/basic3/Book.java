package p01.basic3;

// Class에서는 field 초기값을 거의 설정 않함
// => Constructor method를 통해 초기값을 설정하는 것이 기본
// 1. class에서 선언된 field들은 class내의 메소드에서 직접 사용 가능
public class Book {
	String title;
	String author;

	public Book(String t) {
		title = t;
		author = "작가미상";
	}
	
	public Book(String t, String a) {
		title = t;
		author = a;
	}
	
	public void printBookInformation() {
		System.out.println("책제목 = " + title + ", 책 작가 = " + author);
	}
}
