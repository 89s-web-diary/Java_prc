package 프로그래머스기초2일차;

import java.util.Arrays;

public class N번째원소까지 {

	public static void main(String[] args) {
		int[] num_list = { 2, 1, 6 };
		int n = 1;
		Solution15 sol = new Solution15();
		System.out.println(Arrays.toString(sol.solution(num_list, n)));
	}

}

class Solution15 {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[n];
		for (int i = 0; i < n; i++) {
			answer[i] = num_list[i];
		}
		return answer;
	}
}