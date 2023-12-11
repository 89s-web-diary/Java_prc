package 프로그래머스기초3일차;

public class 소문자로바꾸기 {

	public static void main(String[] args) {
		String myString = "aBcDeFg";
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(myString));
	}

}

class Solution8 {
    public String solution(String myString) {
        return myString.toLowerCase();
    }
}