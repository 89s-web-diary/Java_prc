package 프로그래머스기초2일차;

public class 등차수열특정한항더하기 {

	public static void main(String[] args) {
		int a = 3;
		int d = 4;
		boolean[] included = { true, false, false, true, true };
		Solution6 sol = new Solution6();
		System.out.println(sol.solution(a, d, included));

	}

}

// 두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다.
// 첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때,
// 이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

class Solution6 {
	public int solution(int a, int d, boolean[] included) {
		int sum = a;
		int res = 0;
		for (int i = 0; i < included.length; i++) {
			if(included[i]) {
				res += sum;
			}
			sum += d;
		}
		return res;
	}
}
// 3 7 11 15 19 23