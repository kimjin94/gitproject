package p2021_07_02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Collections01 {
	public static void main(String[] args) {

//	set 인터페이스만으로 객체를 생성할 수 없다.	
//		Set s = new Set();					// 오류발생

		Set set = new HashSet(); 			// 업캐스팅
//	HashSet	set = new HashSet();

		System.out.println("요소의 갯수->" + set.size());

//		add (object e)
		set.add("하나");					   // 업캐스팅
		set.add(2);
		set.add(3.42);
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);							//중복된 데이터를 저장할 수 없다.
		System.out.println("요소의 갯수->" + set.size());
		System.out.println(set);

//		 Iterator(반복자) : "하나", 2, 3.42, "넷", "five", 6
		Iterator elements = set.iterator();
		while (elements.hasNext()) {	// 가져올 데이터가 true리턴
			System.out.println("\t\t" + elements.next());
		}

		/*
		 * Vector에만 적용 Enumeration enu = set.elements(); while( enu.hasMoreElements()){
		 * System.out.println( enu.nextElement() ); }
		 */
	}
}
