package p06.constant_static_variable;

// 1. field를 final로 선언하면, field값을 수정하지 못하여 상수로 사용 가능
// 2. instance final를 final을 사용하여 상수처럼 사용할 때 문제 생김
//    - new로 인스턴스를 만들어야지만 사용가능
//    - 인스턴스마다 상수가 만들어져서 마치 동일한 산수가 여러개 만들어진다
// 3. Java에서는 상수를 만들 때 static final로 사용함
//    - 장점 : new로 인스턴스를 만들지 않아도 되고, 하나의 상수만 존재
public class Earth {
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
	
//  {
//		EARTH_SURFACE_AREA = 4*Math.PI*EARTH_RADIUS*EARTH_RADIUS;
//	}
}
