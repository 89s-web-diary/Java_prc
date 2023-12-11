package 프로그래머스기초5일차;

import java.util.Stack;

public class 두수의합 {

	public static void main(String[] args) {
		String a = "999";
		String b = "1";
		Solution14 sol = new Solution14();
		System.out.println(sol.solution(a, b));
	}
}

class Solution14 {
	public String solution(String a, String b) {
		Stack<Integer> stk1 = new Stack<Integer>();
		Stack<Integer> stk2 = new Stack<Integer>();
		Stack<Integer> ans = new Stack<Integer>();
		for (char c : a.toCharArray()) {
			stk1.push(Integer.parseInt(c + ""));
		}
		for (Character c : b.toCharArray()) {
			stk2.push(Integer.parseInt(c + ""));
		}
		int num = 0;
		int up = 0;
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				if (up == 0) {
					num = stk1.pop() + stk2.pop();
				} else {
					num = stk1.pop() + stk2.pop() + 1;
					up = 0;
				}
				if (num >= 10) {
					ans.push(num - 10);
					up++;
				} else {
					ans.push(num);
				}
			}
			if (up == 1) {
				ans.push(1);
			}
		} else if (a.length() > b.length()) {
			for (int i = 0; i < b.length(); i++) {
				if (up == 0) {
					num = stk1.pop() + stk2.pop();
				} else {
					num = stk1.pop() + stk2.pop() + 1;
					up = 0;
				}
				if (num >= 10) {
					ans.push(num - 10);
					up++;
				} else {
					ans.push(num);
				}
			}
			for (int i = 0; i < a.length() - b.length(); i++) {
				if (up == 1) {
					if (stk1.peek() + 1 >= 10) {
						ans.push(stk1.pop() + 1 - 10);
					}else {
						ans.push(stk1.pop() + 1);
						up = 0;
					}
				} else {
					ans.push(stk1.pop());
				}
			}
			if (up == 1) {
				ans.push(1);
			}
		} else {
			for (int i = 0; i < a.length(); i++) {
				if (up == 0) {
					num = stk1.pop() + stk2.pop();
				} else {
					num = stk1.pop() + stk2.pop() + 1;
					up = 0;
				}
				if (num >= 10) {
					ans.push(num - 10);
					up++;
				} else {
					ans.push(num);
				}
			}
			for (int i = 0; i < b.length() - a.length(); i++) {
				if (up == 1) {
					if (stk2.peek() + 1 >= 10) {
						ans.push(stk2.pop() + 1 - 10);
					}else {
						ans.push(stk2.pop() + 1);
						up = 0;
					}
				} else {
					ans.push(stk2.pop());
				}
			}
			if (up == 1) {
				ans.push(1);
			}
		}
		StringBuilder sb = new StringBuilder();
		while (ans.size() != 0) {
			sb.append(ans.pop());
		}
		String answer = sb.toString();
		return answer;
	}
}