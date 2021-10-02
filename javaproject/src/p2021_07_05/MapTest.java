package p2021_07_05;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {

// Map
//  1. 여러가지 자료형의 데이터를 모두 저장할 수 있다.
//  2. 데이터를 저장할때는 key와 value를 동시에 저장해야한다.
//  3. key값은 중복이 안된다.
//    	만약에 중복된 key값이 있으면, 가장 마지막에 설정된 value만 사용할 수 있다.
//  4. value값은 중복이 되어도 상관없다.

//    	Map 인터페이스만으로는 객체를 생성을 할 수 없다.
//    	Map m = new Map();			//오류 발생

		// HashMap 객체 생성
//		Map hm = new HashMap();		// 업캐스팅	두가지 모두 가능한 경우가 있고 둘중에 하나만 사용한다,
		HashMap hm = new HashMap();

		// 키와 데이터 쌍을 삽입
//      put(Object key, Objectvalue)
		hm.put("woman", "gemini");		// new 써도 상관없음	ex) (new Sting("woman"), "gemini"); 
		hm.put("man", "johnharu");
		hm.put("age", new Integer(10));
		hm.put("city", "seoul");

		// HashMap에 있는 객체들을 출력
		System.out.println(hm);

		// 키 값만 출력
		System.out.println(hm.keySet());

		// 키를 이용해 해당 데이터를 출력
//		Object get(Object key)
		System.out.println(hm.get("woman"));
		System.out.println(hm.get("city"));
	}
}
