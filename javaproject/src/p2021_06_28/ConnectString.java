package p2021_06_28;

public class ConnectString {
	
    public static void main( String[] args ) {
	// String 객체 선언
	String gemini = "gemini";
	String johnharu = "johnharu";
		
	// 두 String 객체를 "+" 연산 수행		=  이름이  결합 되어서 나옴
	String tempString1 = gemini + johnharu;
	System.out.println( tempString1 );
	System.out.println( "gemini" + "johnharu" );

	// String + 정수형 = 문자와 숫자 결함
	String tempString2 = tempString1 + 100;
	System.out.println( tempString2 );
    }
}

