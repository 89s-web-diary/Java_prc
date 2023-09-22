package 제어문.조건문;

import java.util.Date;

public class Date확인문제 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		int year = date.getYear() + 1900;
		
		if(year >= 2000) {
			System.out.println("밀레니엄 세대시군요.");
		}else {
			System.out.println("밀레니엄 세대가 아니시군요.");
		}
		System.out.println("--------------------");
		
		int day = date.getDay();
		
		if(day < 6 && day > 0) {
			System.out.println("열~심히 공부하자");
		}else {
			System.out.println("쉬~~~~~~~~~~~~~~~~자");
		}
		
		System.out.println("--------------------");
		
		int mon = date.getMonth();
		
		switch(mon){
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
		
	}

}
