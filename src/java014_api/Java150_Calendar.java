package java014_api;

import java.util.Calendar;

/*
 * 2016년 2월 마지막일과 요일을 구하는 프로그램을 구현하세요.
 * [출력결과]
 * 2016-2-29 월요일
 */

public class Java150_Calendar {

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
//		cal.set(Calendar.YEAR, 2016);
//		cal.set(Calendar.MONTH, 1);
//		year = cal.get(Calendar.YEAR);
//		month = cal.get(Calendar.MONTH) + 1;
//		date = cal.get(Calendar.DATE);
//		System.out.printf("%d-%d-%d %d\n", year, month, (cal.getActualMaximum(Calendar.DATE)), (cal.getActualMaximum(Calendar.DAY_OF_WEEK)));

		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month = 2;
		
		cal.set(Calendar.YEAR, 2016);
		cal.set(Calendar.MONTH, month - 1);
		System.out.println(cal);
		
		//2016년 2월의 마지막일
		int lastDate = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, lastDate);
		System.out.println(cal);
		
		//2016년 2월 29일의 요일을 리턴
		int day = cal.get(Calendar.DAY_OF_WEEK);
		char week = ' ';
		switch(day) {
		case 1: week = '일'; break;
		case 2: week = '월'; break;
		case 3: week = '화'; break;
		case 4: week = '수'; break;
		case 5: week = '목'; break;
		case 6: week = '금'; break;
		case 7: week = '토'; break;
		}
		
		System.out.printf("%d-%d-%d %c요일\n", year, month, lastDate, week);
		
	}//end main()

}//end class
