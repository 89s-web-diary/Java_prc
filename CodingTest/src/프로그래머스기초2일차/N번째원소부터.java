package 프로그래머스기초2일차;

import java.util.Arrays;

public class N번째원소부터 {

	public static void main(String[] args) {
		int[] num_list = { 2, 1, 6 };
		int n = 3;
		Solution14 sol = new Solution14();
		System.out.println(Arrays.toString(sol.solution(num_list, n)));
	}

}

class Solution14 {
	public int[] solution(int[] num_list, int n) {
		int[] answer = new int[num_list.length-n+1];
		int j = 0;
		for (int i = n-1; i < num_list.length; i++) {
			answer[j] = num_list[i];
			j++;
		}
		return answer;
	}
}