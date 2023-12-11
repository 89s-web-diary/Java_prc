package 프로그래머스기초5일차;

public class 접두사인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_prefix = "ban";
		Solution4 sol = new Solution4();
		System.out.println(sol.solution(my_string, is_prefix));
	}
}

class Solution4 {
    public int solution(String my_string, String is_prefix) {
    	for (int i = 0; i < my_string.length(); i++) {
			if(is_prefix.equals(my_string.substring(0, i+1))) {
				return 1;
			}
		}
        return 0;
    }
}