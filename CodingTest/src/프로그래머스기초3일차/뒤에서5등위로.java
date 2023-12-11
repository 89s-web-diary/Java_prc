package 프로그래머스기초3일차;

import java.util.Arrays;

public class 뒤에서5등위로 {

	public static void main(String[] args) {
		int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
		Solution11 sol = new Solution11();
		System.out.println(Arrays.toString(sol.solution(num_list)));
	}

}

class Solution11 {
    public int[] solution(int[] num_list) {
    	Arrays.sort(num_list);
    	int[] answer = new int[num_list.length-5];
    	for (int i = 0; i < answer.length; i++) {
			answer[i]=num_list[i+5];
		}
        return answer;
    }
}