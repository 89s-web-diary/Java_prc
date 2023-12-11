package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Arrays;

public class AD제거하기 {

	public static void main(String[] args) {
		String[] strArr = { "and", "notad", "abcd" };
		Solution10 sol = new Solution10();
		System.out.println(Arrays.toString(sol.solution(strArr)));
	}
}

class Solution10 {
	public String[] solution(String[] strArr) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < strArr.length; i++) {
			if(!strArr[i].contains("ad")) {
				list.add(strArr[i]);
			}
		}
		String[] answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}