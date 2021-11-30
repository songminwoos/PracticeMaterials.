package p01.using_generic;

// Generic 표기법 : Class이름 + <영어대문자>
// 1. 영어대문자 : T, K, V 등으로 표현 ( T : Type의 의미로 사용), 영문자 중 어떤 글자라도 사용 가능
// 2. 영어대문자 : data type을 의미, data type은 실제 사용 할 떄 결정됨
//      - 예를 들면, Box<String> 으로 사용하면, T는 compile시에 String으로 결정됨
//         Box<Apple>이면 T는 Apple로 결정되고, Box<Integer>면 T는 Integer로 결정됨
// 3. compile시에 data type이 결정되어, 어떠한 class로 data type을 결정하더라도 casting없이 사용 가능
// 4.  Generic type인 T는 class뿐만 아니라, Interface도 사용 가능
public class BoxEx {

	public static void main(String[] args) {
		Box<String> b1 = new Box<String>();
		b1.setT("Hello");
		String str = b1.getT();
		
		Box<Apple> a1 = new Box<Apple>();
		a1.setT(new Apple());
		Apple apple = a1.getT();
		
		Box<Integer> i1 = new Box<Integer>();
		i1.setT(new Integer(10));
		Integer iInstance = i1.getT();
	}

}
