package p2021_06_28;

public class TrimTest {

//	trim() : 문자열의 좌, 우의 공백을 없애주는 역할
//	boolean equals() : 값을 비교하는 역할
	
    public static void main( String[] args ) {
	String str1 = new String( "gemini   " );
	String str2 = new String( "   gemini " );

	System.out.println( str1.equals( str2 ));
	System.out.println( str1.trim().equals( str2.trim()));
    }
}
		