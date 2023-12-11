package 프로그래머스기초5일차;

public class 세로읽기 {

	public static void main(String[] args) {
		String my_string = "ihrhbakrfpndopljhygc";
		int m = 4;
		int c = 2;
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(my_string, m, c));
	}
}

class Solution6 {
    public String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < my_string.length()/m; i++) {
			sb.append(my_string.substring(0+m*i, m+m*i).toString().charAt(c-1));
		}
        return sb.toString();
    }
}