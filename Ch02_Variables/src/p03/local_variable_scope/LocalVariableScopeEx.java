package p03.local_variable_scope;

// 변수(variable)의 생명주기(life-cycle) : 생성되고, 사용하고, 소멸
// 변수의 생명은 메모리에 존재할 때만 생명이 유지됨 => 변수가 메모리에 있을 경우에만 변수 값을 읽고, 쓰고, 수정할 수 있음
// Java에서 변수의 생명 존재 기간 : { ~ ~ } 에서만 존재
// 예로, parentNum은 main method에서만 생명이 유지되고 있음
//      childNum은 if문 안에서만 생명이 유지되고 있음
public class LocalVariableScopeEx {

	public static void main(String[] args) {
		int parentNum = 20;

		if (parentNum > 10) {
			int childNum = parentNum - 10;
			System.out.println("childNum = " + childNum);
			System.out.println("parentNum = " + parentNum);
		}
		
//		System.out.println("childNum = " + childNum);	// childNum cannot be resolved to a variable
		System.out.println("parentNum = " + parentNum);
//		int parentNum2 = parentNum + childNum + 5;

		{
			int a = 20;
		}
		
//		a = 40;

	}
//	parentNum = 20; => main method에서만 생명이 유지되고 있음
	
	
}






