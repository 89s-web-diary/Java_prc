package 프로그래머스기초1일차;

public class 공배수 {

	public static void main(String[] args) {
		int number = 60;
		int n = 2;
		int m =3;
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(number, n, m));
	}

}

// 정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.

class Solution6 {
    public int solution(int number, int n, int m) {
    	if(number%n==0 && number%m==0) {
    		return 1;
    	}
        return 0;
    }
}