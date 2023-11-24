package 베열고급;

import java.util.ArrayList;

import 배열기본.Print;

public class 배열입력배열반환_가변길이 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		int find = 40;
		Solution6 s = new Solution6();
		Print.arr(s.solution(n, find));
	}

}

class Solution6 {
	public int[] solution(int[] n, int find) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : n) {
			if(i > find) {
				list.add(i);
			}
		}
		int[] answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}