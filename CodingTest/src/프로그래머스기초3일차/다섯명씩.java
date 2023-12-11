package 프로그래머스기초3일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 다섯명씩 {

	public static void main(String[] args) {
		String[] names = { "nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx" };
		Solution9 sol = new Solution9();
		System.out.println(Arrays.toString(sol.solution(names)));
	}

}

class Solution9 {
	public String[] solution(String[] names) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < names.length; i = i + 5) {
			list.add(names[i]);
		}
		String[] answer = new String[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}