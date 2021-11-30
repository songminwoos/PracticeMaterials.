package p02.inc_dec;

// increment operator : ++
// 예를 들면 n1++ => n1 = n1 + 1;  (n1 += 1;)
// 1) result = n1++; 
//    기계어 커맨드에서  1) result = n1,  2) n1 = n1 + 1
// 2) result = ++n1; 
//    기계어 커맨드에서  1) n1 = n1 + 1,  2) result = n1
// C language style
public class IncrementOperatorEx {

	public static void main(String[] args) {
		int n1 = 10;
		int result;
		
		System.out.println("n1 = " + n1);
		n1++;	// n1 = n1 + 1; (n1 += 1;)
		System.out.println("n1 = " + n1);	// n1 == 11

		++n1;
		System.out.println("n1 = " + n1);	// n1 == 12

		result = n1++;
//		result = n1;
//		n1 = n1 + 1;	// n1++
		System.out.println("result = " + result);
		System.out.println("n1 = " + n1);
		
		result = ++n1;
//		n1++;
//		result = n1;
		System.out.println("result = " + result);
		System.out.println("n1 = " + n1);
	}

}
