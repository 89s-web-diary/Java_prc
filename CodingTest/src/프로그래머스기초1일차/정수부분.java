package 프로그래머스기초1일차;

public class 정수부분 {

	public static void main(String[] args) {
		double flo = 69.88;
		Solution3 sol = new Solution3();
		System.out.println(sol.solution(flo));
	}

}

// 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요.

class Solution3 {
    public int solution(double flo) {
        return (int)Math.floor(flo);
    }
}