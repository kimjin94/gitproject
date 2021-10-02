package p2021_06_25;

import java.util.ArrayList;
import java.util.Calendar;

public class Report2021_06_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calendar c = Calendar.getInstance();

		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH) + 1;
		int d = c.get(Calendar.DATE);

		int h = c.get(Calendar.HOUR_OF_DAY);

		int mm = c.get(Calendar.MINUTE);
		int s = c.get(Calendar.SECOND);

		int day = c.get(Calendar.DAY_OF_WEEK) - 1;
		String str[] = { "일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일" };

		System.out.println(y + "년" + m + "월" + d + "일" + "" + str[day] + h + "시" + mm + "분" + s + "초");

		System.out.println();

	}

}
