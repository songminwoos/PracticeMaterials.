package p01.vector_ex;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		Vector<Point> v = new Vector<>();
		
		v.add(new Point(2,3));
		v.add(new Point(-5,20));
		v.add(new Point(30,-8));
		
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
//			System.out.println(p.toString());     // 위랑 같은 표현
		}
		
		System.out.println();
		
		v.remove(1);              // remove : 원소 삭제하는 메소드
		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}
		
		for(Point p : v) {
			System.out.println(p);
		}
	}

}
