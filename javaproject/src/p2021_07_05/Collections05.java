package p2021_07_05;

import java.util.*;

class Collections05 {
	public static void main(String[] args) {

//	제네릭을 사용하지 않으면, 여러가지 자료형의 자료를 모두 저장할 수 있다.	
		Vector vec = new Vector();
		vec.add("Apple");					// 업 캐스팅
		vec.add("Banana");
		vec.add("ORANGE");
//		vec.add(50);
//		vec.add(3.14);
//		vec.add('k');
//		vec.add(true);

//		Object get(int index)
		String temp;
		for (int i = 0; i < vec.size(); i++) {
			temp = (String) vec.get(i); // 다운 캐스팅 - 자료형 생략시 오류발생
//		temp=vec.get(i);				// 오류 발생
			System.out.println(vec.get(i));	
			System.out.println(temp.toUpperCase());
		}
	}
}
