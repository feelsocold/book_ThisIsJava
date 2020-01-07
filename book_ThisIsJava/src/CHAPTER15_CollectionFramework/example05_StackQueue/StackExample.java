package CHAPTER15_CollectionFramework.example05_StackQueue;

import java.util.Stack;

// Stack을 이용한 동전 케이스
// LAST IN FIRST OUT
public class StackExample {

	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(1));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();	// 제일 위의 동전 꺼내고, stack에서 제거
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");	
			
		}
				
		
	}

}
