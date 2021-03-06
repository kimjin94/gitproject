package p2021_07_07;

import java.io.*;

public class FileReaderTest {
    public static void main( String[] args ) {
		
	// FileReader 객체 선언	바깠쪽에 선언하면 try이나 finally문 뿐만 아니라 간소화시키는 장점이 있다.
	FileReader file = null;
	int inputValue = 0;
		
	try {
	    // "data.txt" File과 stream 형성
	    file = new FileReader( "data.txt" );

	    // file의 끝을 만날 때까지 데이터를 읽어 들임
	    while(( inputValue = file.read() ) != -1 ) {
			System.out.print(( char )inputValue );
	    }


	    // stream을 닫음
	    file.close();
	} catch ( Exception e ) {
	    System.out.println( e.toString() );
	}
    }//main() end
}
