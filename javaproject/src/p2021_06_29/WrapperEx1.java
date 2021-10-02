package p2021_06_29;

public class WrapperEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer num = new Integer();	// 오류발생

//	박싱(boxing) : heap메모리를 박스로 생각하고. 스택 메모리에 저장된 10을
//				  heap메모리에 복사하는 것(박스에 집어 넣는다.)
		int n = 10;		// 지역변수 (stack 영역)
		Integer num01 = new Integer(n);		// 박싱
//	언박싱(unboxing) : heap메모리에 있는데이터를 stack메모리로 가져오는것
		int n01 = num01.intValue();		// 언박싱(unboxing)
	
		Integer num02 = new Integer("20");
		int n02 = num02 = num02.intValue();
		
		
	}

}
