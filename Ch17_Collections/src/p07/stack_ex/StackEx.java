package p07.stack_ex;

import java.util.Stack;

// Stack class : stack 기능을 구현한 class 
public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));	// stack에 원소 입력
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
//		while (!coinBox.isEmpty()) {
//			Coin coin = coinBox.pop();	// stack에서 원소를 끄집어 내는 것
//			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
//		}
		
		for (Coin coin : coinBox) {
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}

}
