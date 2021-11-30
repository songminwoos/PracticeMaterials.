package p06.use_static_instance;

import java.util.Scanner;

// class 이름 : Circle (원을 class로 만든 것)
// [용어]
// - static field, static method : static으로 선언된 field나 method를 말함
//   예 : field는 numberOfObjects, method는 getNumberOfObjects()
// - instance field, instance method : new Class 이름으로 heap memory에 생성된 instance에서 사용하는 field, method
//   - static으로 선언되지 않은 field, method : 예로 field는 radius, method는 getArea(), getPerimeter(), setRadius()
// 1. static method안에 instance method 사용 불가
//    - 사용 못하는 이유 : static method는 new로 인스턴스 생성하지 않고 Class이름으로 사용 가능하기 때문에
//                     static method에서 instance method를 실행하면 문제가 생기기 때문, java에서 문법적으로 사용 못하게 막음
// 2. static method안에 instance field 사용 불가, this(new로 생성된 인스턴스 주소)도 사용 못함
//	  - 사용 못하는 이유 : static method는 new로 인스턴스 생성하지 않고 Class이름으로 사용 가능하기 때문에
//                     static method에서 instance field를 실행하면, heap memory에 인스턴스가 생성되지 않아 인스턴스 field 사용시 에러 발생
// 3. static method에서 static field나 다른 static method 사용 가능
// 4. instance method에서 static method, static field 모두 사용 가능
public class Circle {
		
		double radius;
		static int numberOfObjects = 0; 	// new로 생성된 인스턴스 개수를 관리하기 위한 목적
		
		// constructor
		public Circle() {
			this.radius = 1;
			numberOfObjects++;
		}
		
		// constructor
		public Circle(double newRadius) {
			this.radius = newRadius;
			numberOfObjects++;
		}

		static int getNumberOfObjects() {
//			getArea()
//			printHello();
//			this.radius = 10;
//			radius = 10;
			numberOfObjects++;		
			return numberOfObjects;
		}
		
		// 원의 면적
		public double getArea() {
			return this.radius*this.radius*Math.PI;
		}
		
		// 원의 둘레 계산
		public double getPerimeter() {
			return 2*Math.PI*this.radius;
		}
		
		// 원의 반지름 값 변경하기
		public void setRadius(double newRadius) {
			this.radius = newRadius;
		}
		
		private void printHello() {
			System.out.println("Hello, instance method");
		}
		
		static private void printHello1() {
			System.out.println("Hello, static method");
		}
}
