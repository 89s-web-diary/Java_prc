package 프로그래머스기초2일차;

public class 정수찾기 {

	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5 };
		int n = 3;
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(num_list, n));
	}

}

class Solution12 {
	public int solution(int[] num_list, int n) {
		for (int i : num_list) {
			if(i==n) {
				return 1;
			}
		}
		return 0;
	}
}