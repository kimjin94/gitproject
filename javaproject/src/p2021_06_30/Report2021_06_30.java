package p2021_06_30;

import java.util.Scanner;

public class Report2021_06_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연도를 입력 해주세요.");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if((y %4 == 0 && y %100 != 0)|| y %400 == 0) {
			System.out.println("입력한 "+y+"년도는 윤년입니다.");
		}else {
			System.out.println("입력한 "+y+"년도는 평년입니다.");
		}
	}

}
