package 프로그래머스기초6일차;

import java.util.Arrays;

public class 이2의영역 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 1 };
		Solution4 sol = new Solution4();
		System.out.println(Arrays.toString(sol.solution(arr)));
	}
}

class Solution4 {
	public int[] solution(int[] arr) {
		int[] range = new int[2];
		range[0] = 100001;
		range[1] = 100002;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==2) {
				range[0]=i;
				break;
			}
		}
		for (int i = arr.length-1; i >= 0; i--) {
			if(arr[i]==2) {
				range[1]=i;
				break;
			}
		}
		if(range[0]==range[1]) {
			int[] answer = {2};
			return answer;
		}else if(range[0]==100001) {
			int[] answer = {-1};
			return answer;
		}else {
			int[] answer = new int[range[1]-range[0]+1];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = arr[i+range[0]];
			}
			return answer;
		}
	}
}