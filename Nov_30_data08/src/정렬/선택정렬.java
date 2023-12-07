package 정렬;

import java.util.Arrays;

public class 선택정렬 {

	public static void main(String[] args) {

		int[] num = { 4, 1, 5, 29, 9, 6 };
		for (int i = num.length - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				if (num[j] > num[j + 1]) {
					swap(num, j, j + 1);
				}
			}
		}
		System.out.println(Arrays.toString(num));

	}

	public static void swap(int[] num, int idx1, int idx2) {
		int tmp = num[idx2];
		num[idx2] = num[idx1];
		num[idx1] = tmp;
		System.out.println(Arrays.toString(num));
	}

}