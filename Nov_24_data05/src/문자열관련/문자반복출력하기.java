package 문자열관련;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		Solution9 s9 = new Solution9();
		String my_string = "hello";
		int n = 3;
		System.out.println(s9.solution(my_string, n));
	}

}

class Solution9 {
	public String solution(String my_string, int n) {
		char[] c = my_string.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (char cc : c) {
			for (int i = 0; i < n; i++) {
				sb.append(cc);
			}
		}
		return sb.toString();
	}
}