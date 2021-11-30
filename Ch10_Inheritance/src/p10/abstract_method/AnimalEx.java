package p10.abstract_method;

// 추상메소드 (abstract method)
// 1. 추상메소드를 사용하기 위해서는 반드시 class를 추상클래스로 선언해야만 함
//    - 추상클래스라는 의미는 결국은 출상클래스를 new로 직접 인스턴스 만들수 없고, 자식을 통해서 인스턴스만들어야 함
// 2. 추상메소드를 사용하기 위해서 추상클래스를 사용함
//   - 추상클래스에서 추상메소드는 구현하는 것이 아니라, 메소드 선언만 하고, 실제 구현 책임은 자식클래스에서 존재  
//   - 추상클래스의 자식클래스는 추상클래스의 추상메소드를 반드시 override하여 구현해야만 함
// 3. polymorphism(다형성)을 위해 사용됨
//   - 문법 : 부모추상클래스 변수 = 자식클래스 변수; (예 : Animal animal = new Dog();)
//   - 사용방법 : 자식에서 부모인 추상클래스의 추상메소드를 override한 메소드를 부모 변수를 통해 실행하여 사용함
//              (예 : animal.sound(); )
//   - 효과 : 자식 인스턴스를 교체함으로 해서, 마치 부품을 교체하는 것처럼 사용 가능 (소스코드 수정양도 대폭 줄어 듬)
// 4. 핵심 목적
//   - Abstract class의 메소드를 추상메소드로 선언하면, 설계만 주는 효과 생김 (method signature만 제공)
//   - 자식클래스에서 실제 구현 책임이 존재.
public class AnimalEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		
		System.out.println("------------");

		// 자동형변환 발생 (부모는 추상클래스)
		Animal animal = new Dog();
		// polymorphism 발생 (자식의 override된 method 실행함)
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		
		System.out.println("-------------");
		
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal) {
		animal.sound();
	}
}






