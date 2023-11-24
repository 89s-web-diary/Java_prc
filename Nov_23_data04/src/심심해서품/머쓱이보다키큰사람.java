package 심심해서품;

public class 머쓱이보다키큰사람 {

	public static void main(String[] args) {
		Solution3 s = new Solution3();
		int[] n = { 149, 180, 192, 170 };
		System.out.println(s.solution(n, 167));
	}

}

class Solution3 {
	public int solution(int[] array, int height) {
		int answer = 0;
		for (int i : array) {
			if(height < i) answer++;
		}
		return answer;
	}
}