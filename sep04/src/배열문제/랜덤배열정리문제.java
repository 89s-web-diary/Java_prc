package 배열문제;

import java.util.Arrays;
import java.util.Random;

public class 랜덤배열정리문제 {

	public static void main(String[] args) {

		Random r = new Random(18);
		int[] n = new int[1000];
		int[] cnt = new int[4];

		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000);
		}

		for (int i : n) {
			if (i >= 300) {
				cnt[0]++;
				if (i >= 400) {
					cnt[1]++;
					if (i >= 500) {
						cnt[2]++;
						if (i >= 600) {
							cnt[3]++;
						} // 600
					} // 500
				} // 400
			} // 300
		}

		System.out.println( "300점 이상 >> " + cnt[0] + 
							"  400점 이상 >> " + cnt[1] +
							"  500점 이상 >> " + cnt[2] +
							"  600점 이상 >> " + cnt[3]);

		Arrays.sort(n);
		System.out.println(Arrays.toString(n));

		System.out.println("최솟값 >> " + n[0]);
		System.out.println("최댓값 >> " + n[n.length - 1]);

	}

}
