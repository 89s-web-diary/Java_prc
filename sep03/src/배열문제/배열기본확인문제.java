package 배열문제;

import java.util.Arrays;

public class 배열기본확인문제 {

	public static void main(String[] args) {

		String[] loc = { "서울", "대전", "대구", "제주도", "부산" };
		char[] clr = { 'r', 'b', 'g', 'w', 'g' };
		double[] hgt = { 177.7, 158.0, 176.1, 165.2, 166.6 };

		System.out.print("[" + loc[0]);
		for (int i = 1; i < hgt.length; i++) {
			System.out.print(", " + loc[i]);
		}
		System.out.println("]");
		System.out.println(Arrays.toString(clr));
		System.out.println(Arrays.toString(hgt));

	}

}
