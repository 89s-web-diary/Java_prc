package 프로그래머스기초6일차;

import java.util.Arrays;

public class 배열조각하기 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] query = { 4, 1, 2 };
		Solution6 sol = new Solution6();
		System.out.println(Arrays.toString(sol.solution(arr, query)));
	}
}

class Solution6 {
	public int[] solution(int[] arr, int[] query) {
		for (int i = 0; i < query.length; i++) {
			if(i%2==0) {
				arr = Arrays.copyOfRange(arr, 0, query[i]+1);
			}else {
				arr = Arrays.copyOfRange(arr, query[i], arr.length);
			}
		}
		return arr;
	}
}