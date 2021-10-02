package p2021_07_01;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Report2021_07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("연도를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		
		
		GregorianCalendar gr = new GregorianCalendar();{
			if(gr.isLeapYear(y)) {
				System.out.println("입력한 "+y+"년도는 윤년입니다.");
			}else {
				System.out.println("입력한 "+y+"년도는 평년입니다.");
			}
		}
		
	}

}
