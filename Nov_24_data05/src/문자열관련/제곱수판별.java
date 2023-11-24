package 문자열관련;

public class 제곱수판별 {

	public static void main(String[] args) {
		Solution11 s11 = new Solution11();
		int n = 15;
		System.out.println((int)Math.sqrt(n));
		System.out.println(s11.solution(n));
	}

}


// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
// 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.

class Solution11 {
    public int solution(int n) {
        return (n == ((int)Math.sqrt(n)*(int)Math.sqrt(n)))?1:2;
    }
}