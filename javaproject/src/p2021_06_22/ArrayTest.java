package p2021_06_22;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min;			// 변수 max, min을 선언
		int[] s = new int[5];	// 지정된 값이 없어서 1차원 배열의 첫번째형식으로 배열 설정

		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {	// 입력한 값을 저장하기 위한 for문
			s[i] = sc.nextInt();
		}
		max = s[0];								// 초기값 선언 및 할당
		min = s[0];								// 초기값 선언 및 할당
		for (int i = 1; i < s.length; i++) {	// 비교을 위한 for문
			if (max < s[i]) max = s[i];			// 비교해서 큰 값에 할당
			if (min > s[i]) min = s[i];			// 비교해서 작은 값을 할당
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
