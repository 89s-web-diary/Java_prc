package 프로그래머스기초5일차;

import java.util.Arrays;

public class 배열의길이에따라다른연산하기 {

	public static void main(String[] args) {
		int[] arr = { 49, 12, 100, 276, 33 };
		int n = 27;
		Solution26 sol = new Solution26();
		System.out.println(Arrays.toString(sol.solution(arr, n)));
	}
}

class Solution26 {
	public int[] solution(int[] arr, int n) {
		int[] answer = new int[arr.length];
		for (int i = 0; i < answer.length; i++) {
			if (arr.length % 2 == 1) {
				if (i % 2 == 0) {
					answer[i] = arr[i] + n;
				} else {
					answer[i] = arr[i];
				}
			} else {
				if (i % 2 == 1) {
					answer[i] = arr[i] + n;
				} else {
					answer[i] = arr[i];
				}
			}
		}
		return answer;
	}
}