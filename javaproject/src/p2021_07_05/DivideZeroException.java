package p2021_07_05;

//예외 처리 하지 않은 예제
public class DivideZeroException {		
    public static void main( String[] args ) {
    	
	// int type의 변수 선언
 	int b = 20;
	int a = 0;

	// 두 수의 나눗셈 결과를 구한다
	int c = b/a;			// 예외 발생  0으로 나누었을 경우
	int total = a + b;
	int sub = b-a;
	
	System.out.println( c );
   }
}

		