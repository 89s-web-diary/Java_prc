package 프로그래머스기초5일차;

public class 가까운1찾기 {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1 };
		int idx = 1;
		Solution25 sol = new Solution25();
		System.out.println(sol.solution(arr, idx));
	}
}

class Solution25 {
	public int solution(int[] arr, int idx) {
		for (int i = idx; i < arr.length; i++) {
			if(arr[i]==1) {
				return i;
			}
		}
		return -1;
	}
}