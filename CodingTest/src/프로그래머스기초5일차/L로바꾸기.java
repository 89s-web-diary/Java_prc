package 프로그래머스기초5일차;

public class L로바꾸기 {

	public static void main(String[] args) {
		String myString = "abcdevwxyz";
		Solution11 sol = new Solution11();
		System.out.println(sol.solution(myString));
	}
}

class Solution11 {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myString.length(); i++) {
			if(myString.charAt(i)-'l'<0) {
				sb.append("l");
			}else {
				sb.append(myString.charAt(i));
			}
		}
        return sb.toString();
    }
}