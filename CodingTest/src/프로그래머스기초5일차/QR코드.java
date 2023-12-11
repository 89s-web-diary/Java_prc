package 프로그래머스기초5일차;

public class QR코드 {

	public static void main(String[] args) {
		int q = 3;
		int r = 1;
		String code = "qjnwezgrpirldywt";
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(q, r, code));
	}

}

class Solution7 {
    public String solution(int q, int r, String code) {
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < code.length(); i++) {
			if(i%q==r) {
				sb.append(code.charAt(i));
			}
		}
        return sb.toString();
    }
}