package p2021_06_18;

public class Report_2021_06_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i <= 9; i += 1) {
			System.out.print("[" + i + "단]\t");
		}
		System.out.println();

		for (int i = 1; i <= 9; i += 1) {
			for (int dan = 2; dan <= 9; dan += 1) {
				System.out.print(dan + "*" + i + "=" + dan * i + "\t");
			}
			System.out.println();
	 }
	}
   }
