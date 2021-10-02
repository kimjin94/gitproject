package p2021_06_28;

public class FindBlankIndex {
    public static void main( String[] args ) {
		
	String message = "Java program creates many objects.";
	
	// message의 길이를 구함.
	// length() : 문자열의 길이를 구해준다. 글자수를 구해줌  배열의 크기는 속성은 구하기에 ()과 없다.
	int len = message.length();

	System.out.println(len);  // len = 34;

	// message 중에서 ' '을 찾음
	for( int i=0 ; i<len ; i++ ) {
	    char c = message.charAt( i );	// i = 인덱스 번호
		if( c == ' ' ) {	// 공백을 찾아라 는 의미 n째인지 결과가 나옴
		    System.out.println( "index = " + i );
		}
	}//for end
    }
}
