package p2021_07_05;

import java.util.*;

class Collections06 {
	public static void main(String[] args) {

//	제너릭(Generic) : 한가지 자료형의 데이터만 저장하도록 한다.  
		Vector<String> vec = new Vector<String>();	// 자료형 선언 

		vec.add("Apple");
		vec.add("Banana");
		vec.add("ORANGE");
//		vec.add(50);	//String형 데이터만 저장할 수 있다.

		
// 제네릭을 사용하게 되면, 자료구조에 데이터를 구해올때 자료형을 생략할 수 있다.		
//		Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = vec.get(i); // 자료형 생략 가능
			System.out.println(temp.toUpperCase());
		}
	}
}
