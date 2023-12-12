package 프로그래머스기초5일차;

public class 대문자로바꾸기 {

	public static void main(String[] args) {
		String myString = "aBcDeFg";
		Solution16 sol = new Solution16();
		System.out.println(sol.solution(myString));
	}
}

class Solution16 {
    public String solution(String myString) {
        return myString.toUpperCase();
    }
}