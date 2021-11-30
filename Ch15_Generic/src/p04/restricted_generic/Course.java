package p04.restricted_generic;

// generic type을 사용하여 new로 인스턴스 생성 불가
public class Course<T> {
	private String name;
	private T[] students;
	
	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) new Object[capacity];
	}
	
	public String getName() {
		return this.name;
	}
	
	public T[] getStudents() {
		return this.students;
	}
	
	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				System.out.println("i = " + i);
				break;
			}
		}
	}
}
