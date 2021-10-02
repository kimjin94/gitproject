package p2021_06_29;

import java.text.DecimalFormat;

public class Report2021_06_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 5;

		double p[] = new double[4];

		p[0] = 2 * Math.PI * r; // Math.PI는 정적팔드
		p[1] = Math.PI * r * r;
		p[2] = 4 * Math.PI * r * r;
		p[3] = 4 / 3 * Math.PI * r * r * r;

		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("원주(원둘레) = " + df.format(p[0]));

		System.out.println("원의 면적 = " + df.format(p[1]));

		System.out.println("구의 표면적 = " + df.format(p[2]));

		System.out.println("구의 체적(부피) = " + df.format(p[3]));

	}

}
