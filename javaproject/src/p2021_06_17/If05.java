package p2021_06_17;

import java.util.Scanner;

public class If05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 키보드로 입력한 점수가 어느 학점에 해당 되는지 판별하는 프로그램을
// 작성하세요.
// 90점이상 - A학점		
// 80점이상 - B학점		
// 70점이상 - C학점		
// 60점이상 - D학점		
// 60점미만 - F학점		
		
		System.out.println("0~100점 사이의 점수를 입력 하세요.");
		Scanner sc = new Scanner(System.in);
		int s= sc.nextInt(); // 예시) s = 95(입력값)
							 //
		if(s>= 90) {		 // A학점조건에 참으로 A학점으로 출력되고 나머지는 실행안됨
			System.out.println("A학점");
		}else if(s>= 80) {
			System.out.println("B학점");
		}else if(s>= 70) {
			System.out.println("C학점");
		}else if(s>= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
	}

}
