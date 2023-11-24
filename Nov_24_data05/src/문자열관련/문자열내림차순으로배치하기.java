package 문자열관련;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {

	public static void main(String[] args) {
		Solution4 s4 = new Solution4();
		String s = "Zbcdefg";
		System.out.println(s4.solution(s));
		
	}

}


class Solution4 {
	public String solution(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		String ss = new String(c);
		StringBuilder sb = new StringBuilder(ss);
		sb.reverse();
		String answer = sb.toString();
		return answer;
	}
	
}