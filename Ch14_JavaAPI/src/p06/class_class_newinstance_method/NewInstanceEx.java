package p06.class_class_newinstance_method;

// Class class의 method newInstance()
// 1. 힙메모리에 인스턴스를 만들려면 new를 사용하는 것이 원칙이나, newInstance()메소드를 사용해도 힙메모리에 인스턴스 생성 가능
// 2. 프로그램 실행하는 중간에 인스턴스를 필요에 따라 자유스럽게 만들 수 있음
// 3. newInstance()메소드 사용하면서 발생할 수 있는 Exception 설명
//   1) InstantiationException : class가 Abstract class이거나 Interface인 경우 Exception 발생
//   2) IllegalAccessException : class의 access modifier가 인스턴스를 만들 수 없는 경우 (예를 들면 private 생성자이름())
public class NewInstanceEx {

	public static void main(String[] args) {
		Action a = new SendAction();
		String sendName = "p06.class_class_newInstance_method.SendAction";
		String receiveName = "p06.class_class_newInstance_method.ReceiveAction";
		String name;
		
		try {
//			name = sendName;
			name = receiveName;
			Class cls = Class.forName(name);
			Action action = (Action) cls.newInstance(); // new ReceiveAction();
			action.execute();
		} catch (ClassNotFoundException e) {
			
		} catch (InstantiationException e) {
			System.out.println("InstantiationException 발생");
		} catch (IllegalAccessException e) {

		}

	}

}
