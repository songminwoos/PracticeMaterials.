package p09.instanceof_basic;

class Person {}
class Student extends Person {}
class Researcher extends Person {}
class Professor extends Researcher {}

// instanceof 사용 문법
// 1. A instanceof B  => A는 변수이름, B는 class 이름
// 2. 의미 : A변수의 힙메모리에 존재하는 인스턴스가 B의 class에 속하는지 여부를 boolean값으로 return
//          => 인스턴스가 존재하면 true, 존재하지 않으면 false를 return
public class InstanceOfEx {

	public static void main(String[] args) {
//		Student s = new Student();
		System.out.print("new Student Instance 결과 -> \t");
		printInstanceInformation(new Student());

		System.out.print("new Researcher Instance 결과 -> \t");
		printInstanceInformation(new Researcher());

		System.out.print("new Professor Instance 결과 -> \t");
		printInstanceInformation(new Professor());
}
	
	// parameter Person p는 Person의 자식 class를 입력받으면 promotion 효과 발생
	public static void printInstanceInformation(Person p) {
		if (p instanceof Person) {
			System.out.print("Person ");
		}
		if (p instanceof Student) {
			System.out.print("Student ");
		}
		if (p instanceof Researcher) {
			System.out.print("Researcher ");
		}
		if (p instanceof Professor) {
			System.out.print("Professor ");
		}
		System.out.println();
	}
}





