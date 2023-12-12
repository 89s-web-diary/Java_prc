package 프로그래머스기초5일차;

public class 간단식계산 {

	public static void main(String[] args) {
		String binomial = "0 - 7777";
		Solution30 sol = new Solution30();
		System.out.println(sol.solution(binomial));
	}
}

class Solution30 {
    public int solution(String binomial) {
    	String[] s = binomial.split(" ");
    	if(s[1].equals("+")) {
    		return Integer.parseInt(s[0]) + Integer.parseInt(s[2]);
    	}else if(s[1].equals("-")){
    		return Integer.parseInt(s[0]) - Integer.parseInt(s[2]);
    	}else {
    		return Integer.parseInt(s[0]) * Integer.parseInt(s[2]);
    	}
    }
}