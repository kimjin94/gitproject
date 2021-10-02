package p2021_07_05;

import java.util.*;

class HashTableTest02 {
	public static void main(String[] args) {
		
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("사과", "Apple");
		ht.put("딸기", "StrawBerry");
		ht.put("포도", "Grapes");
//		ht.put("test", 30);	// 지정된 자료형 외 사용시 오류 발생
		
		
		// 해쉬 테이블의 값을 키를 이용하여 얻는다.
//		Object get(int index)
		String Val = ht.get("포도");	// Object를 받을 때 지정 받은 자료형의 클래스을 받는다. //String 자료형은 생략할 수 있다.
		if (Val != null) {
			System.out.println("포도-> " + Val);
		}
		
//		key를 모르는 경우에 사용하는 방법
//		열거형(Enumeration) : 딸기, 사과, 포도
		Enumeration<String> Enum = ht.keys(); // 해쉬 테이블의 키 요소들에 대한 Enumeration 객체 반환	- 키값을 모를 때
		while (Enum.hasMoreElements()) {
			String k = Enum.nextElement();		// String 자료형은 생략할 수 있다.
			String v = ht.get(k);				// String 자료형은 생략할 수 있다.
			System.out.println(k + " : " + v);
		}
	}
}