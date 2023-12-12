package 프로그래머스기초5일차;

public class Rny_string {

	public static void main(String[] args) {
		String rny_string = "masterpiece";
		Solution19 sol = new Solution19();
		System.out.println(sol.solution(rny_string));
	}
}

class Solution19 {
    public String solution(String rny_string) {
    	StringBuilder sb = new StringBuilder();
    	for (Character c : rny_string.toCharArray()) {
			if(c=='m') {
				sb.append("r");
				sb.append("n");
			}else {
				sb.append(c);
			}
		}
        return sb.toString();
    }
}