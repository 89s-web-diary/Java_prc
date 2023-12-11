package 프로그래머스기초2일차;

public class 주사위1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		Solution11 sol = new Solution11();
		System.out.println(sol.solution(a, b));
	}

}

class Solution11 {
	public int solution(int a, int b) {
		if (a % 2 == 1 || b % 2 == 1) {
			if (a % 2 == 1 && b % 2 == 1) {
				return a * a + b * b;
			}
			return 2 * (a + b);
		} else {
			return Math.abs(a - b);
		}
	}
}