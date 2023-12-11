package 프로그래머스기초2일차;

public class 조건문자열 {

	public static void main(String[] args) {
		String ineq = "<";
		String eq = "=";
		int n = 20;
		int m = 50;
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(ineq, eq, n, m));
		
	}

}

class Solution4 {
    public int solution(String ineq, String eq, int n, int m) {
    	if(eq.equals("!")) {
    		if(ineq.equals(">")) {
    			return n>m?1:0;
    		}else {
    			return n<m?1:0;
    		}
    	}else {
    		if(ineq.equals(">")) {
    			return n>=m?1:0;
    		}else {
    			return n<=m?1:0;
    		}
    	}
    }
}