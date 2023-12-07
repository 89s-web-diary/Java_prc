package 프로그래머스기초1일차;

public class 특정한문자대문자 {

	public static void main(String[] args) {
		
		String my_string = "programmers";
		String alp = "p";
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(my_string, alp));
		
	}

}

// 영소문자로 이루어진 문자열 my_string과 영소문자 1글자로 이루어진 문자열 alp가 매개변수로 주어질 때,
// my_string에서 alp에 해당하는 모든 글자를 대문자로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

class Solution12 {
    public String solution(String my_string, String alp) {
    	char[] c = my_string.toCharArray();
    	for (int i = 0; i < c.length; i++) {
			if(c[i]==alp.charAt(0)) {
				c[i] -= 32;
			}
		}
        return String.valueOf(c);
    }
}