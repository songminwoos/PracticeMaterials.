package p02.runtime_exception;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

// ClassCastException : class casting(강제형변환)할 수 없는 경우에 발생
public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}

	public static void changeDog(Animal animal) {
//		if (animal instanceof Dog) {
//			Dog dog = (Dog) animal;	// casting
//		}
		Dog dog = (Dog) animal;	// casting
	}
}







