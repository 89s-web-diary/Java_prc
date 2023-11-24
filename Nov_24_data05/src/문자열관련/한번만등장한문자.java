package 문자열관련;

import java.util.Arrays;

public class 한번만등장한문자 {

	public static void main(String[] args) {
		Solution10 s10 = new Solution10();
		String s = "hello";
		System.out.println(s10.solution(s));
	}

}

class Solution10 {
	public String solution(String s) {
		StringBuilder sb = new StringBuilder();
		char[] c = s.toCharArray();
		for (char d : c) {
			int cnt = 0;
			for (char e : c) {
				if (d == e) {
					cnt++;
				}
			}
			if(cnt == 1) {
				sb.append(d);
			}
		}
		c = sb.toString().toCharArray();
		Arrays.sort(c);
		String answer = new String(c);
		return answer;
	}
}