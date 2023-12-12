package 프로그래머스기초5일차;

public class 부분문자열 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "aabcc";
		Solution23 sol = new Solution23();
		System.out.println(sol.solution(str1, str2));
	}
}

class Solution23 {
    public int solution(String str1, String str2) {
        return str2.contains(str1)?1:0;
    }
}