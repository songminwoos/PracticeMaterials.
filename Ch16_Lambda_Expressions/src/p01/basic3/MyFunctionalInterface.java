package p01.basic3;

// Lambda expression에서 사용하려면 추상메소드 갯수는 1개만 가능
// @FunctionalInterface : 특정 Interface를 람다함수로 사용할 경우에 Interface 이름위에 사용하는 것을 권장함

@FunctionalInterface
public interface MyFunctionalInterface {

	void method(int x);
}
