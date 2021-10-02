package p2021_06_21;

import java.util.Scanner;

public class Report_2021_06_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	키보드로 입력해서 정수 5개를 입력해서 최대값과 최소값을 구하는 프로그램을 작성하시오.
		int s[] = new int[5];

		System.out.println("5개의 정수를 입력하시오.");
		Scanner sc = new Scanner(System.in);

		int max = 0;		//기본으로 0으로 초기값으로 설정됨
		int min = 9999;		// 이렇게 설정하면 0으로 고정됨

		for (int i = 0; i < s.length; i += 1) {	//for문을 2개를 사용해서 비교 하는것이 좋음
			s[i] = sc.nextInt();				// max, min의 초기값이 설정이 0으로 고정되어 않좋은 예시
			if (s[i] > max)
				max = s[i];
			if (s[i] < min)
				min = s[i];
		}
		System.out.println("max:" + max);
		System.out.println("min:" + min);
	}

}
