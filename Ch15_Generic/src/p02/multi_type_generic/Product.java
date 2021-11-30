package p02.multi_type_generic;

// T, M은 generic type으로 다른 data type과 동등하게 data type으로 사용하면 됨
public class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	
	public void setModel(M model) {
		this.model = model;
	}
}
