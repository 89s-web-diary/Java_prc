package 복습;

import java.util.Stack;

public class 괄호문제 {

	public static void main(String[] args) {
		String s = "()()";
		Solution sol = new Solution();
		System.out.println(sol.solution(s));
	}

}

class Solution {
	public boolean solution(String s) {
		Stack<Character> stack = new Stack<>();
		boolean answer = false;
		try {
			for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i)=='(') {
					stack.add('(');
				}else {
					stack.pop();
				}
			}
			answer = stack.empty();
		} catch (Exception e) {
			answer = false;
		}
		return answer;
	}
}