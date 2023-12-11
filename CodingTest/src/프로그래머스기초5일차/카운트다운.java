package 프로그래머스기초5일차;

import java.util.Arrays;

public class 카운트다운 {

	public static void main(String[] args) {
		int start = 10;
		int end_num = 3;
		Solution8 sol = new Solution8();
		System.out.println(Arrays.toString(sol.solution(start, end_num)));
	}
}

class Solution8 {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start-end_num+1];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = start-i;
		}
        return answer;
    }
}