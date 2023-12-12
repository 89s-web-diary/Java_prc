package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의원소만큼추가 {

	public static void main(String[] args) {
		int[] arr = { 5, 1, 4 };
		Solution15 sol = new Solution15();
		System.out.println(Arrays.toString(sol.solution(arr)));
	}

}

class Solution15 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer i : arr) {
			for (int j = 0; j < i; j++) {
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}