package p02.datatypes.basic;

// 실수값
// 1. 기본(default) 타입은 double임
//   - 3.14 리터럴 값이 double인 8bytes에 저장됨
//   - float 리터럴 값으로 변경하기 위해서는 f를 붙여 사용해야 함 (예 : 3.14f) => f는 float의 약어
//     => 3.14f는 float type의 방 크기인 4bytes에 값이 저장
// 2. 실수 리터값을 double 타입에 넣더라도 정확한 값이 들어가지 못할 수 있음)
// 3. 실수 리터럴 표기법 : 
//    - 지수표기법 사용 가능 (3e6 => 3*10**6,  2e-3 => 2*10**-3)
public class FloatDoubleEx {

	public static void main(String[] args) {
		double var1 = 3.14;
//		float var2 = 3.14;
		float var3 = 3.14f;
		double var4 = 0.1234567890123456789;
		float var5 = 0.1234567890123456789f;

		System.out.println("var1 = " + var1);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println("var5 = " + var5);
		
		int var6 = 3000000;
		double var7 = 3e6;
		float var8 = 3e6F;
		double var9 = 2e-3;
		
		System.out.println("var6 = " + var6);
		System.out.println("var7 = " + var7);
		System.out.println("var8 = " + var8);
		System.out.println("var9 = " + var9);
	}

}















