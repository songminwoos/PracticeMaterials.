package p06.class_class;

// Class class 의미
// 1. Circle과 같이 class에 대한 정보를 갖고 있는 class 
//    class에 대한 정보 : Circle과 같이 class이름, 패키지이름, 필드이름, 생성자 이름, 메소드 이름 등의 정보를 갖고 있음
// 2. 사용 방법
//   1) Object class의 getClass() 메소드를 사용하는 방법
//      - Object class의 new를 사용하여 자식 인스턴스를 만든 후 사용 (비추천)
//   2) Class class의 method인 forName을 사용하는 방법
//      - forName 메소드가 static이어서 Class.forName으로 사용 가능 (추천)
public class ClassEx {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Class cls = circle.getClass();

		System.out.println(cls.getName());
		System.out.println(cls.getSimpleName());
		System.out.println(cls.getPackage().getName());
		
		System.out.println();
		
		try {
			Class cls2 = Class.forName("p06.class_class.Circle");
			System.out.println(cls2.getName());
			System.out.println((cls2.getSimpleName()));
			System.out.println(cls2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			System.out.println("해당하는 class이름이 없습니다.");
		}
		
		
	}

}
