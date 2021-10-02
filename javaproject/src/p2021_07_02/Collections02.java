package p2021_07_02;

import java.util.*;

class Collections02 {

	public static void main(String[] args) {
//  List 인토페이스는 자체적으로 객체를 생성할 수 없다.
//	List li = new List();				// 오류 발생

//  List list = new ArrayList();		// 업캐스팅
		ArrayList list = new ArrayList();

//	boolean add(object e)
		list.add("하나");
		list.add(2);
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list);

	}
}
