package 프로그래머스기초2일차;

import java.util.Arrays;

public class 마지막두원소 {

	public static void main(String[] args) {
		int[] num_list = { 2, 1, 6 };
		Solution10 sol = new Solution10();
		System.out.println(Arrays.toString(sol.solution(num_list)));

	}

}

class Solution10 {
	public int[] solution(int[] num_list) {
		int last = 0;
		if(num_list[num_list.length-1]>num_list[num_list.length-2]) {
			last = num_list[num_list.length-1] - num_list[num_list.length-2];
		}else {
			last = num_list[num_list.length-1]*2;
		}
		int[] answer = new int[num_list.length+1];
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[i];
		}
		answer[answer.length-1] = last;
		return answer;
	}
}