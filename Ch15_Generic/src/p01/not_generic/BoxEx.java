package p01.not_generic;

// 1.Box class을 만든 목적 : 모든 class의 instance를 사용하고 싶어서 
//									  field인 object의 type을 모든 class의 부모인 Object class로 선언
// 2. Box class의 한계 및 문제점 : getObject method를 실행 할 떄 자식 class로 변환하는 casting을 해줘야함
public class BoxEx {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("홍길동");
		String name = (String) box.getObject();
		
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject();
		
		box.setObject(new Integer(10));;
		Integer i = (Integer) box.getObject();
	}

}
