package 프로그래머스기초3일차;

public class 문자열로반환 {

	public static void main(String[] args) {
		int n = 123;
		Solution12 sol = new Solution12();
		System.out.println(sol.solution(n));
	}

}

class Solution12 {
    public String solution(int n) {
        return String.valueOf(n);
    }
}