package 프로그래머스기초6일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기3 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[][] intervals = { { 1, 3 }, { 0, 4 } };
		Solution5 sol = new Solution5();
		System.out.println(Arrays.toString(sol.solution(arr, intervals)));
	}
}

class Solution5 {
	public int[] solution(int[] arr, int[][] intervals) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < intervals.length; i++) {
			for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
				list.add(arr[j]);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}