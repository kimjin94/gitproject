package p2021_07_05;

import java.util.*;

public class StackTest01 {
	public static void main(String[] args) {
		
//	스택(Stack) : LIFO(Last Input First Output)구조	
//		push로 지료를 넣고 pop()으로 꺼낸다.
		Stack myStack = new Stack();
		myStack.push("1-자바");
		myStack.push("2-C++");
		myStack.push("3-API");
		myStack.push("4-MFC");

		
//		System.out.println(myStack.pop());	// 4- MFC
//		System.out.println(myStack.pop());	// 3- API
//		System.out.println(myStack.pop());	// 2- C++
//		System.out.println(myStack.pop());	// 1- 자바
//		System.out.println(myStack.pop());	// 예외 발생
		
		
//		스택 자료구조가 비어있지않은면
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	}
}
