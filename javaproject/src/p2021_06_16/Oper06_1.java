package p2021_06_16;

import java.util.Scanner;

public class Oper06_1 {//숙제

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정수 3개를 입력하세요.");
		int n1, n2, n3, max, min;

		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		max = (n1 > n2 ? n1 : n2 ) > n3 ? (n1 > n2 ? n1 : n2 ) : n3;
		min = (n1 < n2 ? n1 : n2 ) < n3 ? (n1 < n2 ? n1 : n2 ) : n3;
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
		
		
	}

}
