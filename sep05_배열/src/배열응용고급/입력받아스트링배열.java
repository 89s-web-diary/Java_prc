package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 입력받아스트링배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] b = a.split(",");

		System.out.println(Arrays.toString(b));

		int cnt1 = 0, cnt2 = 0;

		for (String string : b) {
			if (string.equals("흐림")) {
				cnt1++;
			} else if (string.equals("맑음")) {
				cnt2++;
			}
		}
		System.out.println(cnt1 + " "+cnt2);

	}

}
