package p06.interface_inheritance;

// Interface 상속(Inheritance)
// 1. 여러개의 부모 인터페이스를 상속하여 자식 인터페이스 생성 가능
// 2. 상속할 때는 class처럼 extends 키워드 사용
public interface InterfaceC extends InterfaceA, InterfaceB {

	public void methodC();
	
}
