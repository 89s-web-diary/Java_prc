package 프로그래머스기초2일차;

public class 두수연산값비교 {

	public static void main(String[] args) {
		
		int a = 91;
		int b = 2;
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(a, b));
		
	}

}

class Solution3 {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a+""+b), 2*a*b);
    }
}