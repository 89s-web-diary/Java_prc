package 프로그래머스기초5일차;

public class 영떼기 {

	public static void main(String[] args) {
		String n_str = "0010";
		Solution9 sol = new Solution9();
		System.out.println(sol.solution(n_str));
	}
}

class Solution9 {
    public String solution(String n_str) {
    	char[] c = n_str.toCharArray();
    	StringBuilder sb = new StringBuilder(n_str);
    	for (int i = 0; i < c.length; i++) {
			if(c[i]-'0'==0) {
				sb.deleteCharAt(0);
			}else {
				break;
			}
		}
    	return sb.toString();
    }
}