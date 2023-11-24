package 심심해서품;

import java.util.*;

public class 중앙값구하기 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		int[] array = { 1, 2, 7, 10, 11 };
		System.out.println(s.solution(array));
	}

}

class Solution5 {
	public int solution(int[] array) {
		Arrays.sort(array);
		int answer = array[(array.length - 1) / 2];
		return answer;
	}
}