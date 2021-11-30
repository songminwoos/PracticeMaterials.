package p01.basic;


// 비교연산자 (Relational Operator) : 2개의 operand(피연산자) 가짐
// 1. ==  예) a == b => a와 b의 값이 같아? => 같으면 true, 틀리면 false
// 2. !=  예) a != b => a와 b의 값이 틀려? => 틀리면 true, 같으면 false
// 3. >, >= 예) a > b => a가 b보다 값이 커? => 값이 크면 true, 작으면 false
//          예) a >= b => a가 b보다 값이 크거나 같아? => 값이 크거나 같으면 true, 아니면 false
// 4. <, <= 예) a < b => a가 b보다 값이 작아? => 값이 작으면 true, 크면 false
//          예) a <= b => a가 b보다 값이 작거나 같아? => 값이 작거나 같으면 true, 아니면 false
public class RelationalOperatorEx {

	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 10;
		int a3 = 5;
		boolean bResult;
		
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("a3 = " + a3);

		System.out.println("a1 == a2 : " + (a1 == a2));
		System.out.println("a1 == a3 : " + (a1 == a3));
		
		bResult = (a1 == a2);
		System.out.println("bResult : " + bResult);
		bResult = (a1 == a3);
		System.out.println("bResult : " + bResult);

		System.out.println("a1 != a2 : " + (a1 != a2));
		System.out.println("a1 != a3 : " + (a1 != a3));

		System.out.println("a1 > a2 : " + (a1 > a2));
		System.out.println("a1 < a2 : " + (a1 < a2));
	
	}

}






