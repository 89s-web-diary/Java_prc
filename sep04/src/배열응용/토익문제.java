package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 토익문제 {

	public static void main(String[] args) {

		Random r = new Random(18);
		int[] ans = new int[999];
		int[] my = new int[999];

		for (int i = 0; i < my.length; i++) {
			ans[i] = r.nextInt(4);
			my[i] = r.nextInt(4);
		}
		System.out.println(Arrays.toString(ans));
		System.out.println(Arrays.toString(my));

		// 하나 맞을 때 점수가 1점
		// 저는 몇 점 일까요???
		int scr = 0;
		for (int j = 0; j < my.length; j++) {
			if (ans[j] == my[j]) {
				scr++;
			}
		}
		System.out.println("내 점수 >>> " + scr);

	}

}
