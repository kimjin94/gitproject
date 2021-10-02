package p2021_06_17;

import java.util.Scanner;

public class Report_2021_06_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		for(int i=n; i>0; i--) { // i>=1도 가능
			sum = sum*i;
		}
		System.out.println(sum); //  sum -> n+"!="+f 수정
	}							 //  sum -> f변경

}
