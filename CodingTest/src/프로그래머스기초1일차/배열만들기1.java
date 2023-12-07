package 프로그래머스기초1일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열만들기1 {

	public static void main(String[] args) {
		
		int n = 10;
		int k = 3;
		Solution11 sol = new Solution11();
		System.out.println(Arrays.toString(sol.solution(n, k)));
		
	}
}

// 정수 n과 k가 주어졌을 때, 1 이상 n이하의 정수 중에서 k의 배수를 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

class Solution11 {
    public int[] solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
			if(i%k==0) {
				list.add(i);
			}
		}
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
        return answer;
    }
}