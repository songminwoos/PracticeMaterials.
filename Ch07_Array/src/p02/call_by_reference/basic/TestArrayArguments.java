package p02.call_by_reference.basic;

// main method에서 testArgument(x, y)가 testArgument(int number, int[] numbers)를 호출할 때 
// 전달되는 x와 y의 실제 값은 어떤 의미가 있느냐?
// 1. primitive type인 x 변수의 실제 값이 testArgument method의 number로 넘어감
//    => call by value
// 2. 참조타입인 y변수 메모리에 들어 있는 heap memory 주소값이 testArgument method의 numbers로 넘어감
//    => call by reference(address)
public class TestArrayArguments {

	public static void main(String[] args) {
		int x = 1;
		int[] y = new int[10];
		
		for (int i=0;i<y.length;i++) {
			y[i] = 0;
		}
		
		testArgument(x, y);
		
		System.out.println("x = " + x);
		System.out.println("y[0] = " + y[0]);
	}

	public static void testArgument(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 3333;
	}
}
