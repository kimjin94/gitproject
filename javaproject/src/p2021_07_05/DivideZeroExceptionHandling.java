package p2021_07_05;

//	예외 처리
//	1. try ~ catch 구문으로 예외처리
//	try{
//	예외가 발생할 가능성이 있는 문장;
//   }catch(예외클래스명  매개변수){
//	예외 메시지;
//   }
//	2. 예외가 발생하면, 예외가 발생한 라인 아래쪽 내용은 실행하지 않고
//		catch 쪽으로 예외를 단진다.

public class DivideZeroExceptionHandling {
    public static void main( String[] args ) {
    	
	// int type의 변수 선언
 	int b = 20;
	int a = 0;
	int c = 0;

	// 두 수의 나눗셈 결과를 구한다

	try {
		c = b/a;		// 예외 발생
		System.out.println("실행 안됨");
		int total = a + b;
		int sub = b-a;
		
	} catch ( ArithmeticException ae ) {
		a = 2;
		c = b/a;
	}
		System.out.println( c );
    }
}

		