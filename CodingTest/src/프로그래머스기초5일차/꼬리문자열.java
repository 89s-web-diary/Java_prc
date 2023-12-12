package 프로그래머스기초5일차;

public class 꼬리문자열 {

	public static void main(String[] args) {
		String[] str_list = { "abc", "def", "ghi" };
		String ex = "ef";
		Solution21 sol = new Solution21();
		System.out.println(sol.solution(str_list, ex));
	}
}

class Solution21 {
	public String solution(String[] str_list, String ex) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str_list.length; i++) {
			if(!str_list[i].contains(ex)) {
				sb.append(str_list[i]);
			}
		}
		return sb.toString();
	}
}