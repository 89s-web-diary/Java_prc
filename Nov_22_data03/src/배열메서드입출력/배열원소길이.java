package 배열메서드입출력;

import 배열기본.Print;

public class 배열원소길이 {

	public static void main(String[] args) {
		Solution33 s = new Solution33();
		String[] n = { "I", "am", "a", "java programmer"};
		Print.arr(s.solution(n));
	}

}

class Solution33 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
        return answer;
    }
}