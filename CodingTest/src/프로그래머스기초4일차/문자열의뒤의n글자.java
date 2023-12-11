package 프로그래머스기초4일차;

public class 문자열의뒤의n글자 {

	public static void main(String[] args) {
		String my_string = "ProgrammerS123";
		int n = 11;
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(my_string, n));
	}
}

class Solution8 {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length()-n);
    }
}