package 프로그래머스기초4일차;

public class 구9로나눈나머지 {

	public static void main(String[] args) {
		String number = "78720646226947352489";
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(number));
	}

}

class Solution4 {
    public int solution(String number) {
    	char[] c = number.toCharArray();
    	int sum = 0;
    	for (char d : c) {
			sum += d-'0';
		}
    	return sum%9;
    }
}