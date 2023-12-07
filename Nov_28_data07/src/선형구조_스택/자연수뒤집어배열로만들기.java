package 선형구조_스택;

import 배열기본.Print;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		Solution4 s = new Solution4();
		long n = 12345;
		Print.arr(s.solution(n));
		
	}

}

class Solution4 {
    public int[] solution(long n) {
    	String[] s = String.valueOf(n).split("");
    	int[] answer = new int[s.length];
		
		for (int j = 0; j < s.length; j++) {
			answer[j] = Integer.parseInt(s[s.length-1-j]); 
		}
        return answer;
    }
}