package 검색;

import java.util.Arrays;

public class 이진검색 {

	public static void main(String[] args) {

		int[] num = { 1, 4, 5, 2, 7, 8, 9, 6 };
		
		// 이진검색을 사용하기 위해선 정렬이 먼저 필요함
		Arrays.sort(num);
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.binarySearch(num, 5)); // 결과 >> 3
		System.out.println(Arrays.binarySearch(num, 8)); // 결과 >> 6
		System.out.println(Arrays.binarySearch(num, 10)); // 결과 >> -9 (-값이 나온다면 없는 것)
		
		System.out.println(Arrays.binarySearch(num, 1, 5, 2)); // 1~4번 인덱스 중에 2는 어디에 있나?
		

	}

}
