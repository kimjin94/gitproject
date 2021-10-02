package p2021_06_18;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String input;
		
		do {
			System.out.print(">");
			input = sc.nextLine();		// 문자로 입력을 받는다.
			System.out.println("입력문자:"+input);
		}while(!input.equals("q"));		// 참이면 프로그램 종료 거짓이면 입력반복
	
		System.out.println("프로그램 종료");
//		프로그램이 실행이 안되는 경우 sc.close();을 추가하는  방법도 있다.
		
	}

}
