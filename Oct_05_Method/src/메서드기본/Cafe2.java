package 메서드기본;

import java.util.Arrays;

public class Cafe2 {

	public static void main(String[] args) {
		
		Cal2 cal = new Cal2();
		System.out.println(cal.add(1, 1));
		System.out.println(cal.add(1, 13.13));
		System.out.println(cal.add(1.66, 113.1));
		System.out.println(cal.add("My age is ", 1));
		System.out.println(Arrays.toString(cal.add()));
		
		
	}

}
