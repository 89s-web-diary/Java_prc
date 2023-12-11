package 프로그래머스기초5일차;

public class n보다커질때까지더하기 {

	public static void main(String[] args) {
		int[] numbers = { 58, 44, 27, 10, 100 };
		int n = 139;
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(numbers, n));

	}
}

class Solution1 {
	public int solution(int[] numbers, int n) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			if (sum > n) {
				break;
			}
		}
		return sum;
	}
}