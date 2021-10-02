package p2021_07_07;

// 입출력에 관한 패키지 import
import java.io.*;
import java.util.Scanner;

public class InputStreamTest {

	public static void main(String[] args) { // 예외처리 할때 try ~ catch문 이외에는 throws Exception을 사용해도 된다.

		// InputStream 객체 생성
		// System.in은 표준입력 장치인 키보드로 부터 입력 받는것을 의미함.
		//	Scanner sc = new Scanner(System.in);  불안정함
		InputStream is = System.in;
		int inputValue = 0;

		System.out.print("Input Data : ");

		try {
			// 키보드로부터 값을 입력 받음 						// 입출력을 할때, 데이터베이스하고 연동할때 예외처리함
			// read() 메소드는 1바이트를 읽어들여서
			// ascii 코드(0~127)값으로 casting함.
			inputValue = is.read();
		} catch (IOException io) { 						// 예외처리 할때 적절한 클래스가 모를때는 Exception을 이용한다.
			// System.out.print(io.toString());
			System.out.print(io.getMessage());
		} // 한글 처리를 못함.

		System.out.println("InputData is " + inputValue);
		System.out.println("InputData is " + (char) inputValue);
	}
}
