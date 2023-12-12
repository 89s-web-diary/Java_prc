package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Arrays;

public class N개간격의원소들 {

	public static void main(String[] args) {
		int[] num_list = { 4, 2, 6, 1, 7, 6 };
		int n = 2;
		Solution22 sol = new Solution22();
		System.out.println(Arrays.toString(sol.solution(num_list, n)));
	}
}

class Solution22 {
	public int[] solution(int[] num_list, int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < num_list.length; i+=n) {
			list.add(num_list[i]);
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}