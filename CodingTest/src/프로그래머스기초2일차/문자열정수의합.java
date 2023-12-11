package 프로그래머스기초2일차;

public class 문자열정수의합 {

	public static void main(String[] args) {
		String num_str = "123456789";
		Solution13 sol = new Solution13();
		System.out.println(sol.solution(num_str));
	}

}

class Solution13 {
    public int solution(String num_str) {
    	String[] str = num_str.split("");
    	int sum = 0;
    	for (String string : str) {
			sum += Integer.parseInt(string);
		}
        return sum;
    }
}