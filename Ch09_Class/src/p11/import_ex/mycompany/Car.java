package p11.import_ex.mycompany;

import p11.import_ex.hankook.SnowTire;
import p11.import_ex.hankook.Tire;
import p11.import_ex.hyundai.Engine;
import p11.import_ex.kumho.BigWidthTire;

// 다른 package에 선언된 class를 사용
// 1. 다른 package에 있는 class를 사용하기위해서는 import 하여 사용
// 2. Tire는 p11.import_ex.hankook과 p11.import_ex.kumho package에 동시에 있기 때문에
//    2개 package에 있는 모든 Tire를 사용할려면, import를 사용하는데 한계가 있어, 
//      field의 class이름에 package를 포함해서 사용해야 함.
// 3. class 이름은 package이름과 결합되어 있음. => 같은 class이름을 갖더라도 package이름이 틀리면 다른 class로 간주함
// class에서 다른 class로 선언되어 있는 field 사용
public class Car {
	Engine engine = new Engine();
	SnowTire snowTire = new SnowTire();
	BigWidthTire bigTire = new BigWidthTire();
	Tire tire1 = new Tire();		// p11.import_ex.hankook package의 Tire class 사용
//	p11.import_ex.hyundai.Engine engine = new p11.import_ex.hyundai.Engine();
//	p11.import_ex.hankook.SnowTire snowTire = new p11.import_ex.hankook.SnowTire();
//	p11.import_ex.kumho.BigWidthTire bigTire = new p11.import_ex.kumho.BigWidthTire();
//	p11.import_ex.hankook.Tire tire1 = new p11.import_ex.hankook.Tire();		// p11.import_ex.hankook package의 Tire class 사용
	p11.import_ex.kumho.Tire tire2 = new p11.import_ex.kumho.Tire();
}
