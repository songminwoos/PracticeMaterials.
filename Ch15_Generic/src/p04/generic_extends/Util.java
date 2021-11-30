package p04.generic_extends;

// < T extends Number>
// => T는 Number class와 Number의 자식 class들만 사용 가능 
// => Number,Byte, Short, Integer, Long, Float, Double만 사용 가능
// => primitive type의 wrapper class만 사용 가능

// int Double.compare(d1, d2;
// return value
//  - d1 < d2 이면,   -1을 return
//  - d1 == d2 이면, 0 을 return
//  - d1 > d2 이면,   1 을 return

public class Util {

	public static <T extends Number> int compare(T t1, T t2) {
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();

		return Double.compare(d1, d2);
	}
}
