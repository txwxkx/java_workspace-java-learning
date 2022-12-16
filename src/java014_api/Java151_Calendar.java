package java014_api;

import java.util.Calendar;

/*
 * 수능일 : 2022-12-17
 * 오늘 : 2022-12-2
 * 남은일 : 15
 */

public class Java151_Calendar {

	public static void main(String[] args) {
		
//		Test tn = Test.getInstance();
//		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal);
//		
//		int year = cal.get(Calendar.YEAR);
//		int month = cal.get(Calendar.MONTH) + 1;
//		int date = cal.get(Calendar.DATE); 
//		
//		cal.set(2022, 11, 17);
//		year = cal.get(Calendar.YEAR);
//		month = cal.get(Calendar.MONTH) + 1;
//		date = cal.get(Calendar.DATE);
//		System.out.printf("수능일 : %d-%d-%d\n", year, month, date);
//		
//		tn = Test.getInstance();
//		
//	    cal = Calendar.getInstance();
//		
//		year = cal.get(Calendar.YEAR);
//		month = cal.get(Calendar.MONTH) + 1;
//		date = cal.get(Calendar.DATE);
//		
//		System.out.printf("오늘 : %d-%d-%d\n", year, month, date);
		
		Calendar examDay = Calendar.getInstance();
		int examDay_year = 2022;
		int examDay_month = 12;
		int examDay_date = 17;
	
		
		examDay.set(examDay_year, examDay_month-1, examDay_date);
		System.out.println(examDay);
		
		Calendar toDay = Calendar.getInstance();
		toDay.set(Calendar.HOUR, 0);
		toDay.set(Calendar.MINUTE, 0);
		toDay.set(Calendar.SECOND, 0);
		//시분초를 고정
		
		System.out.println(toDay);
		
		long eventDay = examDay.getTimeInMillis();
		long nowDay = toDay.getTimeInMillis();
		System.out.println("eventDay:" + eventDay);
		System.out.println("nowDay:" + nowDay);
		
		//하루 계산
		System.out.println(60*60*24*1000);
		
		long endDay = (eventDay-nowDay)/(60*60*24*1000);
		System.out.println("남은 일:" + endDay);
		
		
	}//end main()

}//end class
