package p01.basic;

// 상속 기본 (Inheritance)
// 1. 부모의 field, method 모두 사용 가능
//    - 부모뿐만 아니라, 부모위의 할아버지/할머니 등의 먼 조상의 모든 class들의 field, method 모두 사용
// 2. 사용문법 class 자식클래스이름 extends 부모클래스 이름
//    - 예로, class Student extends Person
// 3. Java는 부모클래스를 선언할 때 1개만 가능
//    - C++은 부모클래스를 선언할 때 여러개 사용 가능
public class InheritEx {

	public static void main(String[] args) {
		Person p = new Person();
		p.name = "아담";
		
		p.speak();
		p.eat();
		p.sleep();
		p.walk();

		Student s = new Student();
		// student의 부모인 Person class의 field, method 모두 사용 가능
		s.name = "홍길동학생";
		s.age = 30;
		s.study();
		s.speak();
		s.eat();
		s.sleep();
		s.walk();
		
		StudentWorker sw = new StudentWorker();
		sw.name = "김학생워커";
		sw.work();
		sw.study();
		sw.speak();
		sw.eat();
		sw.sleep();
		sw.walk();
		
		Researcher r = new Researcher();
		r.name ="강연구원";
		r.research();
		r.speak();
		r.eat();
		r.sleep();
		r.walk();
		
		Professor pf = new Professor();
		pf.name = "안교수";
		pf.teach();
		pf.research();
		pf.speak();
		pf.eat();
		pf.sleep();
		pf.walk();
	}

}













