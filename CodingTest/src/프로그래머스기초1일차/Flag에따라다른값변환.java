package 프로그래머스기초1일차;

public class Flag에따라다른값변환 {

	public static void main(String[] args) {
		Solution8 sol = new Solution8();
		int a = -4;
		int b = 7;
		boolean flag = true;
		System.out.println(sol.solution(a, b, flag));
	}

}

// 두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때
// flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.

class Solution8 {
    public int solution(int a, int b, boolean flag) {
        return flag?a+b:a-b;
    }
}