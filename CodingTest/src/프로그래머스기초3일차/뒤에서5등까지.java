package 프로그래머스기초3일차;

import java.util.Arrays;

public class 뒤에서5등까지 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14};
		Solution10 sol = new Solution10();
		System.out.println(Arrays.toString(sol.solution(num_list)));
	}

}

class Solution10 {
    public int[] solution(int[] num_list) {
    	Arrays.sort(num_list);
    	int[] answer = new int[5];
    	for (int i = 0; i < 5; i++) {
			answer[i] = num_list[i];
		}
        return answer;
    }
}