package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤테스트2 {

	public static void main(String[] args) {

		Random r = new Random(100); // () 안은 Seed값
//		r.setSeed(100);
		int[] arr = new int[1000];

		for (int i = 0; i < 1000; i++) {
			arr[i] = r.nextInt(100);
		}

		System.out.println(Arrays.toString(arr));

	}

}
