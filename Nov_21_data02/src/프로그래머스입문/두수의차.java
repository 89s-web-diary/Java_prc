package 프로그래머스입문;

public class 두수의차 {

	public static void main(String[] args) {
		
		Solution3 s = new Solution3();
		int ans = s.solution(10, 4);
		System.out.println(ans);
		
	}

}

class Solution3 {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }
}