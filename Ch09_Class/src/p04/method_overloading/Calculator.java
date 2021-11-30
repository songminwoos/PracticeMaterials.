package p04.method_overloading;

// method overloading : method이름이 같더라도 method signature가 틀리면, 
// Java에서 자동으로 해당 method signature를 실행 
public class Calculator {
	double area;
	
	// 정사각형 넓이
	double areaRectangle(double width) {
		return width*width;
	}

	// 직사각형 넓이
	double areaRectangle(double width, double height) {
		return width*height;
	}
}
