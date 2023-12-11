package 프로그래머스기초2일차;

public class 주사위2 {

	public static void main(String[] args) {

		int a = 2;
		int b = 6;
		int c = 1;
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(a, b, c));

	}

}

class Solution7 {
	public int solution(int a, int b, int c) {
		if (a == b || b == c || a == c) {
			if (a == b && b == c && c == a) {
				return (a + b + c) + (a * a + b * b + c * c) + (a * a * a + b * b * b + c * c * c);
			} else {
				return (a + b + c) + (a * a + b * b + c * c);
			}
		} else {
			return a + b + c;
		}
	}
}