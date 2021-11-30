package p02.superclass_constructor5;

public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		super();	// 부모 기본 생성자를 호출
		this.name = name;
		this.ssn = ssn;
	}
	
	
}
