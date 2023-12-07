package 프로그래머스;

import java.util.Stack;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		String my_string = "jaron";
		Solution3 s = new Solution3();
		System.out.println(s.solution(my_string));
		
	}
}

class Solution3 {
    public String solution(String my_string) {
    	Stack<Character> stack = new Stack<Character>();
    	char[] c = my_string.toCharArray();
    	for (char d : c) {
			stack.push(d);
		}
        String answer = "";
        for (int i = 0; i < c.length; i++) {
        	answer += stack.pop();
		}
        return answer;
    }
}