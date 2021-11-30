package p06.class_promotion;

// class에서의 자동 형변환(promotion) 정의
// 1. 부모와 자식 class간에서 발생
// 2. 자식이 인스턴스로 생성할 경우 부모 데이터 타입으로 넘길 때 발생
//    - 부모 인스턴스 변수 = 자식 인스턴스 변수; (예 : p = s;)
// 3. 힙메모리 사용 관점에서 보면, 자동형변환은 자식 인스턴스가 생성한 자식과 부모인스턴스 2개에서 부모 인스턴스만 사용한다는 의미
// 4. 자식인스턴스를 부모인스턴스로 자동형변환하면, 부모 class에서 선언된 field, method만 사용 가능
public class StudentEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		s.printPersonInformation();
		s.printStudentInformation();

		// 부모인스턴스인 p에 자식 인스턴스인 s의 주소를 넣은 것임
		p = s;
		System.out.println(p.name);
		p.printPersonInformation();
//		p.printStudentInformation();
	}

}
