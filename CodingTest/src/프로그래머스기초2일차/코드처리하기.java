package 프로그래머스기초2일차;

public class 코드처리하기 {

	public static void main(String[] args) {
		String code = "abc1abc1abc";

		Solution5 sol = new Solution5();
		System.out.println(sol.solution(code));

	}

}

class Solution5 {
	public String solution(String code) {
		char[] c = code.toCharArray();
		StringBuilder sb = new StringBuilder();
		int mode = 0;
		for (int i = 0; i < c.length; i++) {
			if (mode == 0) {
				if (c[i] == '1') {
					mode = 1;
				} else {
					if (i % 2 == 0) {
						sb.append(c[i]);
					}
				}
			} else {
				if (c[i] == '1') {
					mode = 0;
				} else {
					if (i % 2 == 1) {
						sb.append(c[i]);
					}
				}
			}
		}
		if(sb.toString().isEmpty()) {
			return "EMPTY";
		}
		return sb.toString();
	}
}