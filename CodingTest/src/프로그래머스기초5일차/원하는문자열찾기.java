package 프로그래머스기초5일차;

public class 원하는문자열찾기 {

	public static void main(String[] args) {
		String myString = "AbCdEfG";
		String pat = "aBc";
		Solution24 sol = new Solution24();
		System.out.println(sol.solution(myString, pat));
	}
}

class Solution24 {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase())?1:0;
    }
}