package 생성자복습;

import java.util.Arrays;

public class 내카페5 {

	public static void main(String[] args) {
		
		Cal5 cal = new Cal5();
		
		int[] num = {1,3,4,5,7,8,2,2,4,5,6,9};
	
		System.out.println(Arrays.toString(num));
		System.out.println(cal.getEven(num));
		System.out.println(cal.getOdd(num));
		System.out.println(cal.getUnique(num));
	}

}
