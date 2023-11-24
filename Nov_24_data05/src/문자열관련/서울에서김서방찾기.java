package 문자열관련;

import java.util.Arrays;

public class 서울에서김서방찾기 {

	public static void main(String[] args) {
		Solution6 s6 = new Solution6();
		String[] seoul = { "Jane", "Kim" };
		System.out.println(s6.solution(seoul));

	}

}

class Solution6 {
	public String solution(String[] seoul) {
		int x = Arrays.asList(seoul).indexOf("Kim");
        return "김서방은 " + x + "에 있다";
	}
}