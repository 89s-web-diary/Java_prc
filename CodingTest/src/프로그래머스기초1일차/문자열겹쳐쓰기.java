package 프로그래머스기초1일차;

public class 문자열겹쳐쓰기 {

	public static void main(String[] args) {
		
		Solution sol = new Solution();
		String my_string = "He11oWor1d";
		String overwrite_string = "lloWorl";
		int s = 2;
		String answer = sol.solution(my_string, overwrite_string, s);
		System.out.println(answer);
		
	}

}

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }
}