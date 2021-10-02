package p2021_07_07;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {
	public static void main(String[] args) {

		// 입력을 받아들이는 변수 선언
		int inputValue = 0;

		// FileInputStream 객체 선언
		FileInputStream file = null;

		try {
			// "read.txt"와 InputStream 형성
			file = new FileInputStream("read.txt"); 	// 상대 경로 // 같은 패캐지에서 있으면 못읽는다.
//			file = new FileInputStream("E:/read.txt"); 	// 절대 경로  최상위 경로 -> 하위 경로 -> 파일 

			// file의 끝을 만날 때까지 데이터를 읽어 들임
			// read() 메소드는 File에서 한 byte씩 데이터를 읽어옴.
			// 읽어온 데이터를 int로 변환해서 리턴,파일의 끝을
			// 만나면 -1을 반환함.
			while ((inputValue = file.read()) != -1) {
				System.out.print((char) inputValue);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// stream을 형성한 file을 닫음
		try {
			file.close();
		} catch (IOException io) {
			System.out.println(io.toString());
		}
	}// main() end
}
