package p2021_06_17;

public class If01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if(조건식){
//	         조건식이 참인경우 실행될 문장(기본형);
//	    }
		
		if(10>5) {
			System.out.println("실행1");
		}
		if(10>5)
			System.out.println("실행2");	// 실행될 문장이 한줄인경우에는 {}를 생략할 수 있다.
		if(10>5) System.out.println("실행3");
		if(true) {
			System.out.println("무조건 실행");
		}
		if(false) {
			System.out.println("실행안됨");
		}
//	if문에 {}가 없으면, if문 바로 아랫쪽 1줄만 if문의 적용을 받는다. 	
		if(10 > 30)
			System.out.println("출력안됨");
			System.out.println("조건식의 적용을 받지않고 실행됨");
		
		
	}

}
