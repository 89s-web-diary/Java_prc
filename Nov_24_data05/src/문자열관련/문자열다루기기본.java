package 문자열관련;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		Solution5 s5 = new Solution5();
		String s = "a234";
		
	}

}
// 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
// 예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

class Solution5 {
    public boolean solution(String s) {
    	char[] c = s.toCharArray();
    	if(c.length == 4 || c.length == 6) {
    		for (char d : c) {
    			if( d-'0' > 9) {
    				return false;
    			}
    		}
    		return true;
    	}else {
    		return false;
    	}
    }
}