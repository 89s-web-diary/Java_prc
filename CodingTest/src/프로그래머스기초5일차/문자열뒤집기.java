package 프로그래머스기초5일차;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		String my_string = "Progra21Sremm3";
		int s = 6;
		int e = 12;
		Solution5 sol = new Solution5();
		System.out.println(sol.solution(my_string, s, e));
	}
}

class Solution5 {
    public String solution(String my_string, int s, int e) {
    	StringBuilder sb1 = new StringBuilder(my_string);
    	StringBuilder sb2 = new StringBuilder(my_string.substring(s, e+1));
        sb2.reverse();
        sb1.replace(s, e+1, sb2.toString());
        return sb1.toString();
    }
}