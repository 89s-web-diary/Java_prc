package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤평균 {

	public static void main(String[] args) {

		Random r = new Random();
		int[] n = new int[1000];
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 1000; i++) {
			n[i] = r.nextInt(1000);
			sum = sum + n[i];
			if (n[i] >= 500) {
				count++;
			}
		}
		System.out.println(Arrays.toString(n));
		System.out.println("전체 합 : " + sum);
		System.out.println("전체 평균 : " + (double) sum / n.length);
		System.out.println("50이상 숫자의 갯수 : " + count);
	}

}
