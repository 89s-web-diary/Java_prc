package 프로그래머스;

public class 숨어있는숫자덧셈 {

	public static void main(String[] args) {
		Solution7 s = new Solution7();
		String my_string = "aAb1B2cC34oO09p";
		System.out.println(s.solution(my_string));
		
		
	}

}

class Solution7 {
    public int solution(String my_string) {
    	char[] c = my_string.toCharArray();
    	int answer = 0;
    	for (char d : c) {
			if(d-'0' <= 9) {
				answer += Integer.parseInt(d+"");
			}
		}
        return answer;
    }
}