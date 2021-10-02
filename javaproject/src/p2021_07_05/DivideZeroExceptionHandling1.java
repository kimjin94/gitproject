package p2021_07_05;

//	예외 처리
//	catch문에서 예외처리 클래스를 잘 모를때 예외 클래스 중에서
//	최상위 클래스인 Exception클래스로 모든 예외를 다 받을 수 있다.

public class DivideZeroExceptionHandling1 {
    public static void main( String[] args ) {
    	
	// int type의 변수 선언
 	int b = 20;
	int a = 0;
	int c = 0;

	// 두 수의 나눗셈 결과를 구한다

	try {
		c = b/a;				// 예외 발생
		int total = a + b;
		int sub = b-a;
		
	} catch ( Exception e ) {
		a = 2;
		c = b/a;
	}

		System.out.println( c );
    }
}

