package 배열심화;

import java.util.Arrays;
import java.util.Random;

public class 랜덤배열정리문제 {

	public static void main(String[] args) {

		Random r = new Random(0);
		int[] n = new int[1000];
		int cnt300 = 0;
		int cnt400 = 0;
		int cnt500 = 0;
		int cnt600 = 0;

		for (int i = 0; i < n.length; i++) {
			n[i] = r.nextInt(1000);
			if (n[i] >= 300) {
				cnt300++;
				if (n[i] >= 400) {
					cnt400++;
					if (n[i] >= 500) {
						cnt500++;
						if (n[i] >= 600) {
							cnt600++;
						} // 600
					} // 500
				} // 400
			} // 300
		} // for문

		System.out.println("300점 이상 >> " + cnt300);
		System.out.println("400점 이상 >> " + cnt400);
		System.out.println("500점 이상 >> " + cnt500);
		System.out.println("600점 이상 >> " + cnt600);

		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		
		System.out.println("최솟값 >> " + n[0]);
		System.out.println("최댓값 >> " + n[n.length-1]);

	}

}
