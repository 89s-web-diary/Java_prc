package 프로그래머스기초3일차;

import java.util.Arrays;

public class 카운트업 {

	public static void main(String[] args) {
		int start_num = 3;
		int end_num = 10;
		Solution4 sol = new Solution4();
		System.out.println(Arrays.toString(sol.solution(start_num, end_num)));

	}

}

class Solution4 {
	public int[] solution(int start_num, int end_num) {
		int[] answer = new int[end_num-start_num+1];
		int cnt=0;
		for (int i = start_num; i <= end_num; i++) {
			answer[cnt] = i;
			cnt++;
		}
		return answer;
	}
}