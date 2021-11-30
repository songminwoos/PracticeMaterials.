package p01.practice;

// method에 parameter를 전달할 때 값(value)으로 전달된다는 것을 학습
// increment(x) 메소드에서 x의 의미? => x의 값인 1을 increment method의 변수 n에 전달
// 1. method는 기본적으로 parameter로 값을 전달 (pass by value)
//    => parameter가 primitive type(byte, short,int, double, boolean)만 pass by value
// 2. method가 수행하여 변경된 값을 전달받고 싶을 경우는 어떻게 해야 하나?
//    => return value type 사용
// 3. 참조타입(String, 배열, Class,,)은 pass by value가 아님, 
//    => 즉 호출된 메소드에서 변경된 값이 호출한 메소드(예를 들면, main)로 전달됨
public class IncrementValue {

	public static void main(String[] args) {
		int x = 1;
		
		System.out.println("increment method 호출하기 전의 x 값 = " + x);
		increment(x);	
		System.out.println("increment method 호출한 후의 x 값 = " + x);

		x = newIncrement(x);
		System.out.println("newIncrement method 호출한 후의 x 값 = " + x);
	}

	public static void increment(int n) {
		n++;
		System.out.println("increment method내에서의 n값 = " + n);
	}
	
	public static int newIncrement(int n) {
		n++;
		System.out.println("newIncrement method내에서의 n값 = " + n);
		
		return n;
	}

}











