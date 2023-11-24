package 베열고급;

import java.util.*;

import 배열기본.Print;

public class 배열입력배열반환_고정길이2 {

	public static void main(String[] args) {
		int[] n = { 44, 3, 22, 66, 88 };
		Solution4 s = new Solution4();
		int[] result = s.solution(n);
		Print.arr(result);

	}

}

class Solution4 {
	public int[] solution(int[] n) {
		// 정렬은 한 후 모든값에 100을 곱해서 리턴
		int[] answer = new int[n.length];
		Arrays.sort(n);
		for (int i = 0; i < n.length; i++) {
			answer[i] = n[i] * 100;
		}
		return answer;
	}
}
