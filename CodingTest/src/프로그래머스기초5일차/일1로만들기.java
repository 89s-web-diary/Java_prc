package 프로그래머스기초5일차;

public class 일1로만들기 {

	public static void main(String[] args) {
		int[] num_list = { 12, 4, 15, 1, 14 };
		Solution29 sol = new Solution29();
		System.out.println(sol.solution(num_list));
	}
}

class Solution29 {
	public int solution(int[] num_list) {
		int answer = 0;
		for (int i = 0; i < num_list.length; i++) {
			int a = num_list[i];
			while(a!=1) {
				if(a%2==0) {
					a = a/2;
					answer++;
				}else {
					a = (a-1)/2;
					answer++;
				}
			}
		}
		return answer;
	}
}