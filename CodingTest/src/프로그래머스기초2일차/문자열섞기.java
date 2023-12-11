package 프로그래머스기초2일차;

public class 문자열섞기 {

	public static void main(String[] args) {
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		Solution1 sol = new Solution1();
		System.out.println(sol.solution(str1, str2));
	}

}

class Solution1 {
    public String solution(String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();
		for (int i = 0; i < str1.length(); i++) {
			sb.append(c1[i]);
			sb.append(c2[i]);
		}
        return sb.toString();
    }
}