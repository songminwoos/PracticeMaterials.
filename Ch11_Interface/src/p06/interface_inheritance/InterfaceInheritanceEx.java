package p06.interface_inheritance;

public class InterfaceInheritanceEx {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;	// 자동형변환 (자식클래스를 부모인 InterfaceA로 변환)
		ia.methodA();
//		ia.methodB();
//		ia.methodC();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}

