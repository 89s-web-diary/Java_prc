package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class X사이의개수 {

	public static void main(String[] args) {
		String myString = "xabcxdefxghi";
		Solution13 sol = new Solution13();
		System.out.println(Arrays.toString(sol.solution(myString)));
	}
}

class Solution13 {
	public int[] solution(String myString) {
		ArrayList<Character> list = new ArrayList<Character>();
		for (char c : myString.toCharArray()) {
			list.add(c);
		}
		int[] answer = new int[Collections.frequency(list, 'x')+1];
		int cnt=0; int j =0;
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) - 'x' != 0) {
				cnt++;
			}else {
				answer[j] = cnt;
				cnt = 0;
				j++;
			}
		}
		answer[j] = cnt;
		return answer;
	}
}