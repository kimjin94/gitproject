package p2021_07_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	키보드로 구구단 1개 단을 입력 받아서, 구구단 1개단을 출력하는 
//	프로그램을 작성하세요.
		
		System.out.println("원하는 단을 입력하세요.");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		try {
			String input = br.readLine();		// String input = "5";
			int dan = Integer.parseInt(input);	// int dan = 5;
			
			for(int i = 1; i<=9; i+=1)
				System.out.println(dan+"*"+i+"="+dan*i);
			
		}catch(Exception e) {
			System.out.println("숫자만 입력하세요");
		}
		
		
		
		
	}

}
