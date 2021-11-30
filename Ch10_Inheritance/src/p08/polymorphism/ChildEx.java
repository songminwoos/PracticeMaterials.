package p08.polymorphism;

// 다형성 (polymorphism)
// 1. 자동형변환이 발생해야만 함
//    부모인스턴스 = 자식인스턴스;   (예 : Parent parent = child;)
// 2. 부모 메소드를 자식 메소드에서 override(메소드재정의) 한 경우만 해당
// 3. 자동형변환과 override 모두 충족이 될 때, 부모 메소드를 호출하는 것이 아니라,
//    override된 자식 메소드를 호출함 => 이것을 polymorphism(다형성)이라 함

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();

		System.out.println();
		
		Parent parent = child;	// 자동형변환(promotion)
		
		parent.method1();
		parent.method2();
//		parent.method3();

	}

}
