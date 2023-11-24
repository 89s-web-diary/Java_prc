package 베열고급;

import 배열기본.Print;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5 };
		Solution2 s = new Solution2();
		int[] result = s.solution(n);
		Print.arr(result);

	}

}

class Solution2 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length-1-i];
		}
		return answer;
	}
}
