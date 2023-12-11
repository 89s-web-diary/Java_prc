package 프로그래머스기초4일차;

public class 접미사인지확인하기 {

	public static void main(String[] args) {
		String my_string = "banana";
		String is_suffix = "ana";
		Solution10 sol = new Solution10();
		System.out.println(sol.solution(my_string, is_suffix));
	}
}


class Solution10 {
    public int solution(String my_string, String is_suffix) {
    	int answer = 0;
    	for (int i = 0; i < my_string.length(); i++) {
			if(is_suffix.equals(my_string.substring(i))){
				answer++;
			}
		}
        return answer;
    }
}