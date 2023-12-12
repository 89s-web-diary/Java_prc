package 프로그래머스기초6일차;

import java.util.Arrays;

public class 문자개수세기 {
	public static void main(String[] args) {
		String my_string = "Programmers";
		Solution2 sol = new Solution2();
		System.out.println(Arrays.toString(sol.solution(my_string)));
	}
}

class Solution2 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for(char c : my_string.toCharArray()){
            if(c-'A'>26){
                answer[c-'A'-6]++;
            }else{
                answer[c-'A']++;                
            }
        }
        return answer;
    }
}