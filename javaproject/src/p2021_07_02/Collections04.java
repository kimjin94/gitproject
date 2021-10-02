package p2021_07_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Collections04 {

	public static void main(String[] args) {
		List list = new ArrayList(); 	// 업캐스팅로 객채 생성
//	ArrayList list = new ArrayList();	// 객체 생성

		list.add("하나");
		list.add(2);
		list.add(3.42);
		list.add("넷");
		list.add("five");
		list.add(6);

		System.out.println(list); 
		
		System.out.println(list.get(2)); // 인덱스 2번원소를 추출 : 3.42
		System.out.println(list.get(4)); // 인덱스 4번원소를 추출 : five
		
//		object get(int index)
		for (int i = 0; i < list.size(); i++) {
			System.out.println( i + " 번째 요소는 " + list.get(i)); 	 // 변수로 하든지
			Object s = list.get(i);   								 // object로 출력한다.
//			String s =(String)(list.get(i));	다운캐스팅 오류발생
			System.out.println(s);
		}

//		 향상된 for문
		for(Object s : list) {
			System.out.print(s+"\t");
		}
		System.out.println();
		
//	반복자(Iterator)	- 불편해서 잘 않 쓰임
	Iterator elements=list.iterator();    
	while(elements.hasNext()) {
      System.out.println("\t\t" + elements.next());
	}	

	}
}
