package 프로그래머스기초5일차;

public class 문자열바꿔서찾기 {

	public static void main(String[] args) {
		String myString = "ABBAA";
		String pat = "AABB";
		Solution27 sol = new Solution27();
		System.out.println(sol.solution(myString, pat));
	}
}

class Solution27 {
    public int solution(String myString, String pat) {
    	StringBuilder sb = new StringBuilder();
    	for (char c : myString.toCharArray()) {
			if(c=='A') {
				sb.append('B');
			}else {
				sb.append('A');
			}
		}
        return sb.toString().contains(pat)?1:0;
    }
}