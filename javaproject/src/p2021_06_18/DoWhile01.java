package p2021_06_18;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		do{
//	           반복 실행할 문장;
//	    }while(조건식);

// do ~ while문으로 '사랑해요' 메세지를 10번 출력 하세요.
		
		int i=1;		// 초기값
		do {
			System.out.println(i+"사랑해요");
			i+=1;		// 증감식   / 실행하는 문장에만 i++; i+=; 같은 증감식을 사용한다.
		} while(i<=10);	// 조건식  /거짓인 경우 1번은 실행한다. (while문은 거짓인 경우 실행이 안됨)
		
		
		
		
		
	}

}
