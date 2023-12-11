package 프로그래머스기초4일차;

public class 간단한논리연산 {

	public static void main(String[] args) {
		boolean x1 = false; 
		boolean x2 = true; 
		boolean x3 = true; 
		boolean x4 = true; 
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(x1, x2, x3, x4));

	}

}

class Solution3 {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
    	boolean x12 = x1 || x2;
    	boolean x34 = x3 || x4;
        return x12&&x34;
    }
}