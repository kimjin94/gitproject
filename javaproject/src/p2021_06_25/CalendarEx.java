package p2021_06_25;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	3. calendar 클래스

//		Calendar c1 = new Calendar(); 잘 못 된 예  코드
		Calendar c2 = new GregorianCalendar(); 				// 업케스팅 거의 않쓰임

		Calendar c = Calendar.getInstance(); 				// 주로 쓰임
//		System.out.println(c);
//		System.out.println(Calendar.YEAR);					// 1
		int y = c.get(Calendar.YEAR); 						// 연도
		int m = c.get(Calendar.MONTH) + 1; 					// 월 (0~11) 모든 프로그램어들도 같다. 그래서 +1을 해준다.
		int d = c.get(Calendar.DATE);
//		int

		System.out.println(y + "-" + m + "-" + d);

		int h1 = c.get(Calendar.HOUR); 						// 12시간제
		int h2 = c.get(Calendar.HOUR_OF_DAY);				// 24시간제

		int ap = c.get(Calendar.AM_PM); 					// 0:오전, 1:오후
		if (ap == 0) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}

		int mm = c.get(Calendar.MINUTE); 					// 분
		int s = c.get(Calendar.SECOND); 					// 초

		
		
		System.out.println(h1 + ":" + mm + ":" + s); 		// 12시간제
		System.out.println(h2 + ":" + mm + ":" + s); 		// 24시간제

	}

}
