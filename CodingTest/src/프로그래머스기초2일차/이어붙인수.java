package 프로그래머스기초2일차;

public class 이어붙인수 {

	public static void main(String[] args) {
		int[] num_list = { 3, 4, 5, 2, 1 };
		Solution9 sol = new Solution9();
		System.out.println(sol.solution(num_list));

	}

}

class Solution9 {
	public int solution(int[] num_list) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		for (int i : num_list) {
			if (i % 2 == 0) {
				sb1.append(i);
			} else {
				sb2.append(i);
			}
		}
		return Integer.parseInt(sb1.toString()) + Integer.parseInt(sb2.toString());
	}
}