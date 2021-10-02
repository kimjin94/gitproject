package p2021_07_06;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Report2021_07_06 {

	public static void main(String[] args) {
		try {

			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
			Thread th = new Thread(() -> {
				try {
					for (int i = 0; i < 100; i+=1) {
						System.out.println(format.format(new Date()));
						Thread.sleep(1000);
					}
				} catch (Throwable e) {
					e.printStackTrace();
				}
			});
			th.start();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
