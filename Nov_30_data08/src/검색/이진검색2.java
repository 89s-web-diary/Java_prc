package 검색;

import java.util.Arrays;

public class 이진검색2 {

	public static void main(String[] args) {

		int[] num = { 1, 4, 5, 2, 7, 8, 9, 6 };

		// 이진검색을 사용하기 위해선 정렬이 먼저 필요함
		Arrays.sort(num);

		System.out.println(Arrays.toString(num));
		StringBuilder sb = new StringBuilder();
		sb.append(Arrays.binarySearch(num, 1) + "-");
		sb.append(Arrays.binarySearch(num, 7) + "-");
		sb.append(Arrays.binarySearch(num, 6));
		System.out.println(sb);

	}

}
