package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 순서바꾸기 {

	public static void main(String[] args) {
		int[] num_list = { 2, 1, 6 };
		int n = 1;
		Solution17 sol = new Solution17();
		System.out.println(Arrays.toString(sol.solution(num_list, n)));
	}
}

class Solution17 {
	public int[] solution(int[] num_list, int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = n; i < num_list.length; i++) {
			list.add(num_list[i]);
		}
		for (int i = 0; i < n; i++) {
			list.add(num_list[i]);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}