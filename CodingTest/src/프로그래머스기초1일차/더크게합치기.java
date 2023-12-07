package 프로그래머스기초1일차;

public class 더크게합치기 {

	public static void main(String[] args) {
		int a = 89;
		int b = 8;
		Solution7 sol = new Solution7();
		System.out.println(sol.solution(a, b));
	}

}

class Solution7 {
    public int solution(int a, int b) {
    	String ab = a + "" + b;
    	String ba = b + "" + a;
    	if(Integer.parseInt(ab) >= Integer.parseInt(ba)) {
    		return Integer.parseInt(ab);
    	}else {
    		return Integer.parseInt(ba);
    	}
    }
}