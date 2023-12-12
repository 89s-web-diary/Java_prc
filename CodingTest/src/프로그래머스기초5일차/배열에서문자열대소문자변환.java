package 프로그래머스기초5일차;

import java.util.Arrays;

public class 배열에서문자열대소문자변환 {

	public static void main(String[] args) {
		String[] strArr = { "AAA", "BBB", "CCC", "DDD" };
		Solution28 sol = new Solution28();
		System.out.println(Arrays.toString(sol.solution(strArr)));
	}
}

class Solution28 {
	public String[] solution(String[] strArr) {
		String[] answer = new String[strArr.length];
		for (int i = 0; i < strArr.length; i++) {
			for (char c : strArr[i].toCharArray()) {
				if (c >= 'A' && c <= 'z') {
					if(i%2==1) {
						answer[i] = strArr[i].toUpperCase();
					}else {
						answer[i] = strArr[i].toLowerCase();
					}
				}else {
					answer[i] = strArr[i];
				}
			}
		}
		return answer;
	}
}