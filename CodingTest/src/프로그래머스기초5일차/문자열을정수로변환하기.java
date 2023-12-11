package 프로그래머스기초5일차;

public class 문자열을정수로변환하기 {

	public static void main(String[] args) {
		String n_str = "10";
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(n_str));
	}
}

class Solution2 {
    public int solution(String n_str) {
        return Integer.parseInt(n_str);
    }
}