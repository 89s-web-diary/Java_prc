package 프로그래머스기초2일차;

public class 원소들의곱과합 {

	public static void main(String[] args) {

		int[] num_list = { 5, 7, 8, 3 };
		Solution8 sol = new Solution8();
		System.out.println(sol.solution(num_list));
	}

}

class Solution8 {
	public int solution(int[] num_list) {
		int sum = 0;
		int mul = 1;
		for (int i : num_list) {
			mul *= i;
			sum += i;
		}
		return mul < sum*sum ? 1 : 0;
	}
}