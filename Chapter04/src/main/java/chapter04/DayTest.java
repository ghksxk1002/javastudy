package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DayTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		printDate01(now);
		printDate02(now);

	}

	public static void printDate01(Date d) {
		// 2020-09-13 뒤에나오는건 포멧이다
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(d);
		System.out.println(date);
	}

	public static void printDate02(Date d) {
		// 년도(+1900)을 해주어야 한다.
		int year = d.getYear();
		// 월(0~11, +1)을 해주어야 한다
		int month = d.getMonth();
		// 일
		int day = d.getDate();
		// 시
		int hour = d.getHours();
		//분
		int minutes = d.getMinutes();
		//초
		int seconds = d.getSeconds();
		
		System.out.println((year+1900) +" "+ (month+1)+" "+day+" "+hour+":"+minutes+":"+seconds );
		
		
		
		
		
	}

}
