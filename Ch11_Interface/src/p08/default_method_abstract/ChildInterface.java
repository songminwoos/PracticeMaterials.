package p08.default_method_abstract;
/*
 부모 Interface에서 default method로 선언된 것을 자식 Interface에서 추상메소드로 재정의(Override) 가능
 */
public interface ChildInterface extends ParentInterface {
	
	public void method3();
	@Override
	public void method2();
}
