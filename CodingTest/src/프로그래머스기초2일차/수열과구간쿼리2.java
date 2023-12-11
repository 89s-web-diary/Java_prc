package 프로그래머스기초2일차;

import java.util.Arrays;

public class 수열과구간쿼리2 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 3};
		int[][] queries = { { 0, 4, 2 }, { 0, 3, 2 }, { 0, 2, 2 } };
		Solution19 sol = new Solution19();
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}

}

class Solution19 {
    public int[] solution(int[] arr, int[][] queries) {
    	int[] answer = new int[queries.length];
    	for (int i = 0; i < queries.length; i++) {
    		int min = queries[i][2];
    		answer[i] = min;
			for (int j = queries[i][0]; j < queries[i][1]+1 ; j++) {
				if(arr[j]>queries[i][2]) {
					min = arr[j];
					if(min<answer[i]) {
						answer[i] = arr[j];
					}
				}
			}
		}
    	for (int i = 0; i < answer.length; i++) {
			if(answer[i]==queries[i][2]) {
				answer[i] = -1;
			}
		}
        return answer;
    }
}
