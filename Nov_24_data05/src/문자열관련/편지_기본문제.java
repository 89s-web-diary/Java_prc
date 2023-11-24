package 문자열관련;

public class 편지_기본문제 {

	public static void main(String[] args) {
		Solution8 s8 = new Solution8();
		String message = "happy birthday!";
	}

}

class Solution8 {
	public int solution(String message) {
		return message.length()*2;
	}
}