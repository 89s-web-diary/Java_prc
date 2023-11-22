package 배열메서드입출력;

import 배열기본.Print;

public class 짝수홀수 {

	public static void main(String[] args) {
		int[] num = {1, 3, 5, 7};
		Print.arr(num);
		Solution22 s = new Solution22();
		Print.arr(s.solution(num));
	}

}

class Solution22 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
    	for (int i : num_list) {
			if(i%2 == 0) answer[0]++;
			else answer[1]++;
		}
        return answer;
    }
}