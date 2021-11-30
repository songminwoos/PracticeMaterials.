package p01.basic;

// 상속 : 부모 생성자 자동 호출하여 부모 인스턴스 자동 생성
// - new StudentWorker()를 호출하면, Java에서 new Student(), new Person()을 자동 실행하여
//   부모인 Student 인스턴스와 할아버지인 Person 인스턴스를 힙메모리에 자동 생성해줌
public class InheritEx2 {

	public static void main(String[] args) {
	
		StudentWorker sw = new StudentWorker();
		sw.name = "김학생워커";
		sw.work();
		sw.study();		// new Student();
		sw.speak();		// new Person();
		sw.eat();
		sw.sleep();
		sw.walk();
		
	}

}













