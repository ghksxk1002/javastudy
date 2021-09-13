package chapter04;

import java.util.Calendar;
//calender
public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		
		printDate(cal);
		
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 11);//12 내가 세팅하고 싶은 월에서 -1을 해야된다
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2021, 8, 13);
		cal.add(Calendar.DATE, 100);//카렌더에 세팅한 날짜 +100
		printDate(cal);
	}
	
	public static void printDate(Calendar cal) {
		
		final String[] DAYS = {"일", "월", "화", "수", "목", "금"};
		
		int year = cal.get(Calendar.YEAR);
		int mounth = cal.get(Calendar.MONTH);
		int date = cal.get(Calendar.DATE);//0~11 +1
		int day = cal.get(Calendar.DAY_OF_WEEK);//1(일) ~ 7(통)
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println(year+"년 "+ (mounth+1)+"월 "+date+"일 "+DAYS[day-1]+"요일 "+hour+":"+minute+":"+second );
	}

}
