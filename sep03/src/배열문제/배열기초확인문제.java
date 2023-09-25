package 배열문제;

import java.util.Arrays;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		
		// 배열 기초 확인 문제 1번
		int[] n1 = new int[200];

		n1[0] = 1000;
		n1[1] = 2000;
		n1[2] = 3000;
		n1[n1.length - 1] = 5000;

		System.out.println(Arrays.toString(n1));

		// 배열 기초 확인 문제 2번
		double[] n2 = new double[300];

		n2[0] = 10.1;
		n2[1] = 20.2;
		n2[2] = 30.2;
		n2[n2.length - 1] = 50.5;

		System.out.println(Arrays.toString(n2));
	}

}
