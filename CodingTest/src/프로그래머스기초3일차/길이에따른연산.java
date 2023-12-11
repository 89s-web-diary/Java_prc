package 프로그래머스기초3일차;

public class 길이에따른연산 {

	public static void main(String[] args) {
		int[] num_list = { 3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1 };
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(num_list));

	}
}

class Solution7 {
	public int solution(int[] num_list) {
		int answer = 0;
		if(num_list.length>10) {
			for (int i : num_list) {
				answer += i;
			}
		}else {
			answer = 1;
			for (int i : num_list) {
				answer *= i;
			}
		}
		return answer;
	}
}