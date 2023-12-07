package 정렬;

import java.util.Arrays;

public class 최댓값과최솟값 {

	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(s));
	}
}

class Solution1 {
	public String solution(String s) {
		String[] str = s.split(" ");
		int[] num = new int[str.length];
		for (int i = 0; i < str.length; i++) {
			num[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(num);
		String answer = num[0] + " " + num[num.length - 1];
		return answer;
	}
}