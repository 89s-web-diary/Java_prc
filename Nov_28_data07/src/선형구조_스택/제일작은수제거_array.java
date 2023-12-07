package 선형구조_스택;

import java.util.*;

import 배열기본.Print;

public class 제일작은수제거_array {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] n = { 10 , 1 };
		Print.arr(s.solution(n));
	}

}

class Solution2 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer i : arr) {
			list.add(i);
		}
		int min = Collections.min(list);
		list.remove(list.indexOf(min));
		int[] answer = null;
		if (list.size() != 0) {
			answer = new int[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
			return answer;
		} else {
			answer = new int[1];
			answer[0] = -1;
		}
		return answer;
	}
}