package 프로그래머스기초5일차;

public class 문자열의앞의n글자 {

	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(my_string, n));
		
	}
}


class Solution3 {
    public String solution(String my_string, int n) {
        return my_string.substring(0, n);
    }
}