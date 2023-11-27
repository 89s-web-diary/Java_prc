package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import 배열기본.Print;

public class 완주하지못한선수_답안 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String[] part = {"mislav", "stanko", "mislav", "ana"};
		String[] comp = {"stanko", "ana", "mislav"};
		System.out.println(s.solution(part, comp));
	}

}

class Solution5 {
    public String solution(String[] participant, String[] completion) {
    	HashMap<String, Integer> list = new HashMap<>();
		for (int i = 0; i < participant.length; i++) {
			list.put(participant[i], list.getOrDefault(participant[i], 0)+1);
		}
		System.out.println(list);
		
		for (int i = 0; i < completion.length; i++) {
			list.put(completion[i], list.get(completion[i])-1);
		}
		System.out.println(list);
		
		String answer = "";
		for (int i = 0; i < participant.length; i++) {
			if(list.get(participant[i])!=0) {
				answer = participant[i];
			}
		}
		return answer;
    }
}