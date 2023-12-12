package 프로그래머스기초6일차;

import java.util.Arrays;

public class 글자지우기 {

	public static void main(String[] args) {
		String my_string = "apporoograpemmemprs";
		int[] indices = { 1, 16, 6, 15, 0, 10, 11, 3 };
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(my_string, indices));
	}
}

class Solution1 {
	public String solution(String my_string, int[] indices) {
		StringBuilder sb = new StringBuilder();
		Arrays.sort(indices);
		int j = 0;
		for (int i = 0; i < my_string.length(); i++) {
			if(i==indices[j]) {
				j++;
				if(j==indices.length) j=0;
			}else {
				sb.append(my_string.charAt(i));
			}
		}
		return sb.toString();
	}
}

