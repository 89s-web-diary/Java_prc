package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열이몇번등장하는지세기 {

	public static void main(String[] args) {
		String myString = "banana";
		String pat = "ana";
		Solution31 sol = new Solution31();
		System.out.println(sol.solution(myString, pat));
	}
}

class Solution31 {
    public int solution(String myString, String pat) {
    	ArrayList<String> list = new ArrayList<String>();
    	for (int i = 0; i < myString.length()-pat.length()+1; i++) {
    		list.add(myString.substring(i, i+pat.length()));
		}
    	int answer = Collections.frequency(list, pat);
        return answer;
    }
}