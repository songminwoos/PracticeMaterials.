package p01.object_class_equals2;

// Member class에서 Object class의 equals method를 override 실습
// 1. equals method의 parameter인 obj의 type을 Object class로 한 이유
//    => 모든 클래스의 부모인 Object로 자동형변환(promotion)시키기 위해서 임
// 2. id.equals(member.id) 
//    => id가 String이기 때문에, 이 것은 String class의 equals method 사용
//    => String의 equals 메소드는 문자열이 같으면 true를 return, 문자열이 틀리면 false를 return 
// 3. 모든 class는 암묵적으로 Object class를 extends로 상속받고 있음
//    => Member class를 new로 사용하여 힙메모리에 인스턴스를 만들면, 부모인 Object도 힙메모리에 자동으로 생성됨
//public class Member extends Object {
public class Member {
	public String id;
//	public String name;
//	public String address;
//	public int age;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;	// Object class를 Member class로 강제 형변환(casting)
			
			// 여기서는 id값이 같은 경우만 코딩되어 있지만, name, address, age등이 모두 같은지 등을 체크하는 코딩 가능
			if (id.equals(member.id)) {
				return true;
			}
			
		}
		
		return false;
	}
}
