package p09.pass_array_of_object;

// 1. 1차원 배열에서 int[] numbers;  => 1차원 배열인데 배열의 원소 type이 int
// 2. 1차원 배열에서 String[] args  => 1차원 배열인데 배열의 원소 type이 String
// 3. 실습 목적 Circle[] circleArray;  => 1차원 배열인데 배열의 원소 type이 Circle
// 참고. Math.random()*100 => 0 ~ 99.999999999
public class TotalArea {

	public static void main(String[] args) {
		Circle[] circleArray;
		circleArray = createCircleArray();
		System.out.println("main에서의 circleArray 주소 = " + System.identityHashCode(circleArray));

		printCircleArray(circleArray);
		
	}

	public static Circle[] createCircleArray() {
		Circle[] c = new Circle[5];		// int[] num = new int[5];
		
		for (int i=0; i<c.length;i++) {
			c[i] = new Circle(Math.random()*100);
		}
		
		System.out.println("메소드 안에서의 c 주소 = " + System.identityHashCode(c));
		return c;
	}
	
	public static void printCircleArray(Circle[] ciArr) {
		System.out.println("printCircleArray 메소드 안에서의 ciArr 주소 = " + System.identityHashCode(ciArr));
		
		System.out.println("Radius \t\t  Area");
		for (int i=0; i<ciArr.length;i++) {
			System.out.println(ciArr[i].getRadius() + "\t\t" + ciArr[i].getArea());
		}
	}
}









