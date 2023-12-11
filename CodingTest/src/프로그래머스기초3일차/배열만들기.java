package 프로그래머스기초3일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기 {

	public static void main(String[] args) {
		int l = 5;
		int r = 555;
		Solution3 sol = new Solution3();
		System.out.println(Arrays.toString(sol.solution(l, r)));
		String s = "505";
		System.out.println(s.replace("5", ""));
	}
}

// 정수 l과 r이 주어졌을 때, l 이상 r이하의 정수 중에서 숫자 "0"과 "5"로만 이루어진 모든 정수를
// 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
// 만약 그러한 정수가 없다면, -1이 담긴 배열을 return 합니다.

class Solution3 {
	public int[] solution(int l, int r) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int j = l; j <= r; j++) {
			if (String.valueOf(j).replace("5", "").replace("0", "").isEmpty()) {
				list.add(j);
			}
		}
		if(list.size()==0) {
			list.add(-1);
		}
		int[] answer= new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}