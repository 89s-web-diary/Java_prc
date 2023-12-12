package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 할일목록 {

	public static void main(String[] args) {
		String[] todo_list = { "problemsolving", "practiceguitar", "swim", "studygraph" };
		boolean[] finished = { true, false, true, false };
		Solution20 sol = new Solution20();
		System.out.println(Arrays.toString(sol.solution(todo_list, finished)));
	}
}

class Solution20 {
	public String[] solution(String[] todo_list, boolean[] finished) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < todo_list.length; i++) {
			if(!finished[i]) {
				list.add(todo_list[i]);
			}
		}
		String[] answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}