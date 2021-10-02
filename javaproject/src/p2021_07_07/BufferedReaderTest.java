package p2021_07_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest {
	public static void main(String[] args) {

		InputStream is = System.in;							// 3줄 버전
		InputStreamReader isr = new InputStreamReader(is);	// 업캐스팅
		BufferedReader br = new BufferedReader(isr);
		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		// 1줄버전
		 */
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("Input Data : ");

		try {// 입력한 한줄을 모두읽음.
			String inputString = br.readLine();
			System.out.println();
			System.out.println("Output String = " + inputString);
		} catch (IOException io) {
			System.out.println(io.getMessage());
		}
	}// main() end
}
