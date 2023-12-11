package 프로그래머스기초5일차;

import java.util.Arrays;

public class 공백으로구분하기 {

	public static void main(String[] args) {
		String my_string = "i love you";
		Solution12 sol = new Solution12();
		System.out.println(Arrays.toString(sol.solution(my_string)));
	}
}

class Solution12 {
    public String[] solution(String my_string) {
        return my_string.split(" ");
    }
}