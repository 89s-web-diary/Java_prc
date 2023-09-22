package 제어문.조건문;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println("현재 시간은 " + hour + "시 " + min + "분 " + sec + "초입니다");
		
		int year = date.getYear() + 1900;
		int mon = date.getMonth() + 1;
		int today = date.getDate();
		System.out.println("오늘은 " + year + "년 " + mon + "월 " + today + "일입니다");
		
		int day = date.getDay();
		System.out.println(day);
				
	}

}
