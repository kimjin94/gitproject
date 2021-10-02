package p2021_06_28;

import java.util.Scanner;

public class Report2021_06_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력하세요.");
		String jumin1 = sc.nextLine();
		System.out.println("주민번호 뒷자리를 입력하세요.");
		String jumin2 = sc.nextLine();

		if (jumin1.equals("")) {
			System.out.println("주민번호 앞자리를 입력하세요.");
		} else if (jumin1.length() != 6) {
			System.out.println("다시 주민번호 앞자리 6자리를 입력하세요.");
		} else if (jumin2.equals("")) {
			System.out.println("주민번호 뒷자리 를 입력하세요.");
		} else if (jumin2.length() != 7) {
			System.out.println("다시 주민번호 뒷자리 7자리를 입력하세요.");
		}
		String ssn = jumin1 + jumin2;
		int[] chk = { 2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5 };

		int total = 0;
		int i = 0;

		for (i = 0; i < ssn.length() - 1; i++) {
			String ss = ssn.substring(i, i + 1);
			int ssint = Integer.parseInt(ss);

			total += ssint * chk[i];
		}

		int l = Integer.parseInt(ssn.substring(i, i + 1));
		int result = (11 - total % 11) % 10;

		if (l == result) {
			System.out.println("유효한 주민번호");
		} else {
			System.out.println("다시 입력 해주세요");
		
		}
	}

}
