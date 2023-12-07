package 프로그래머스;

import java.util.Arrays;

public class 삼각형완성조건 {
	public static void main(String[] args) {

		Solution6 s = new Solution6();
		int[] sides = { 1, 2, 3 };

	}
}

class Solution6 {
	public int solution(int[] sides) {
		Arrays.sort(sides);
		if (sides[2] < sides[0] + sides[1]) {
			return 1;
		} else
			return 2;
	}
}