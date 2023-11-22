package 배열메서드입출력;

import java.util.*;

import 배열기본.Print;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		Solution44 sl = new Solution44();
		int[] n = { 5, 9, 7, 10 };
		int div = 5;
		int[] res = sl.solution(n, div);
		Print.arr(res);
	}

}
// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

class Solution44 {
	public int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr);
		for (int i : arr) {
			if (i % divisor == 0) {
				list.add(i);
			}
		}
		if (list.size() != 0) {
			int[] answer = new int[list.size()];
			for (int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
			return answer;
		} else {
			int[] answer = { -1 };
			return answer;
		}
	}
}