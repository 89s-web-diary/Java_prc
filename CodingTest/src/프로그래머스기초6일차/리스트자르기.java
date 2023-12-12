package 프로그래머스기초6일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 리스트자르기 {

	public static void main(String[] args) {
		int n = 2;
		int[] slicer = {0, 5, 2};
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Solution3 sol = new Solution3();
		System.out.println(Arrays.toString(sol.solution(n, slicer, num_list)));
	}
}

class Solution3 {
	public int[] solution(int n, int[] slicer, int[] num_list) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = slicer[0];
		int b = slicer[1];
		int c = slicer[2];
		switch (n) {
		case 1:
			for (int i = 0; i <= b; i++) {
				list.add(num_list[i]);
			}
			break;
		case 2:
			for (int i = a; i <= num_list.length-1; i++) {
				list.add(num_list[i]);
			}
			break;
		case 3:
			for (int i = a; i <= b; i++) {
				list.add(num_list[i]);
			}
			break;
		case 4:
			for (int i = a; i <= b; i=i+c) {
				list.add(num_list[i]);
			}
			break;
		default:
			break;
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}