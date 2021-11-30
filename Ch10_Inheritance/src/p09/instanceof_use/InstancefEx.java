package p09.instanceof_use;

class Parent {}
class Child extends Parent {}

// 부모클래스를 자식클래스로 casting할 때 반드시 instanceof를 사용하여 자식 인스턴스로 변환가능한지 체크할 것
public class InstancefEx {

	public static void main(String[] args) {
		Parent pa = new Child();
		method1(pa);
		method2(pa);
		
		Parent pb = new Parent();
		method1(pb);
		method2(pb);
	}

	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child 인스턴스로 변환 성공");
		} else {
			System.out.println("method1 - Child 인스턴스로 변환할 수 없습니다.");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child 인스턴스로 변환 성공");
	}
}







