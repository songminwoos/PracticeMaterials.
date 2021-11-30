package p04.polymorphism2;

public class Car {
//	Tire frontLeftTire  = new HankookTire();
//	Tire frontRightTire = new HankookTire();
//	Tire backLeftTire   = new HankookTire();
//	Tire backRightTire  = new HankookTire();
	Tire[] tires = {
			new HankookTire(), // index 0 : frontLeftTire
			new HankookTire(), // index 1 : frontRightTire
			new HankookTire(), // index 2 : backLeftTire
			new HankookTire()  // index 3 : backRightTire
	};

	void run() {
		for (Tire tire: tires) {
			tire.roll();
		}
//		for (int i=0; i<tires.length;i++) {
//			tires[i].roll();
//		}
	}
}





