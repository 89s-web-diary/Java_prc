package 프로그래머스기초2일차;

public class 문자리스트문자열변환 {

	public static void main(String[] args) {
		String[] arr = { "a", "b", "c" };
		Solution2 sol = new Solution2();
		System.out.println(sol.solution(arr));

	}

}

// 문자들이 담겨있는 배열 arr가 주어집니다.
// arr의 원소들을 순서대로 이어 붙인 문자열을 return 하는 solution함수를 작성해 주세요.

class Solution2 {
	public String solution(String[] arr) {
		StringBuilder sb = new StringBuilder();
		for (String string : arr) {
			sb.append(string);
		}
		return sb.toString();
	}
}