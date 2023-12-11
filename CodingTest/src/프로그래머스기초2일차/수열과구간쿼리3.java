package 프로그래머스기초2일차;

import java.util.Arrays;

public class 수열과구간쿼리3 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 };
		int[][] queries = { { 0, 3 }, { 1, 2 }, { 1, 4 } };
		Solution18 sol = new Solution18();
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}

}

class Solution18 {
	public int[] solution(int[] arr, int[][] queries) {
		int temp = 0;
		for (int i = 0; i < queries.length; i++) {
			temp = arr[queries[i][0]];
			arr[queries[i][0]] = arr[queries[i][1]];
			arr[queries[i][1]] = temp;
		}
		return arr;
	}
}