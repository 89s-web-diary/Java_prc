package 프로그래머스기초5일차;

import java.util.ArrayList;
import java.util.Arrays;

public class 공백으로구분하기2 {

	public static void main(String[] args) {
		String my_string = "i    love  you";
		Solution18 sol = new Solution18();
		System.out.println(Arrays.toString(sol.solution(my_string)));
	}
}

class Solution18 {
    public String[] solution(String my_string) {
    	ArrayList<String> list1 = new ArrayList<String>();
    	ArrayList<String> list2 = new ArrayList<String>();
    	for (String string : my_string.split(" ")) {
			list1.add(string);
		}
    	for (int i = 0; i < list1.size(); i++) {
			if(!list1.get(i).equals("")) {
				list2.add(list1.get(i));
			}
		}
    	String[] answer = new String[list2.size()];
    	for (int i = 0; i < answer.length; i++) {
			answer[i] = list2.get(i);
		}
    	return answer;
    }
}