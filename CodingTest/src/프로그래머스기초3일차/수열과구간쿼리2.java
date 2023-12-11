package 프로그래머스기초3일차;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 수열과구간쿼리2 {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 3, 7, 10};
		int[][] queries = { { 0, 6, 5 }, { 0, 3, 2 }, { 0, 2, 2 } };
		Solution1 sol = new Solution1();
		System.out.println(Arrays.toString(sol.solution(arr, queries)));
	}

}

class Solution1 {
    public int[] solution(int[] arr, int[][] queries) {
    	int[] answer = new int[queries.length];
    	ArrayList<Integer> list = null;
    	for (int i = 0; i < queries.length; i++) {
    		list = new ArrayList<Integer>();
			for (int j = queries[i][0]; j <= queries[i][1] ; j++) {
				if(arr[j]>queries[i][2]) {
					list.add(arr[j]);
				}
			}
			try {
				answer[i] = Collections.min(list);
			} catch (Exception e) {
				answer[i] = -1;
			}
    	}
        return answer;
    }
}
