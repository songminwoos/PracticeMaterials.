package p07.class_casting;

// class에서의 강제 형변환(casting) 정의
// 1. 부모와 자식 클래스간에만 사용 가능
// 2. 자식 인스턴스 = (자식클래스타입) 부모 인스턴스
//    예: s = (Student) p;
// 3. 힙메모리 관점에서 보면, 
//   - p는 힙메모리에 원래 자식 인스턴스와 부모인스턴스가 존재하는데, 부모 인스턴스만 사용하는 경우
//   - p의 힙메모리 주소를 자식 변수에 넣는다는 의미
//   - p가 힙메모리에 부모 인스턴스만 존재할 경우는 casting을 사용하면 안됨
// 4. 왼쪽의 자식은 다시 본인인 자식인스턴스와 부모인스턴스 모두 사용하겠다는 의미임
//   - 부모와 자식 클래스에 생성된 모든 field, method를 사용하겠다는 의미
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
		
		s = (Student) p;	// casting
		s.printPersonInformation();
		s.printStudentInformation();
		
		Person p1 = new Person("홍길동");
		s = (Student) p1;
		s.printPersonInformation();
		s.printStudentInformation();
	}

}
