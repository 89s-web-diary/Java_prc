package 비선형구조;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import 배열기본.Print;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		Solution5 s = new Solution5();
		String[] part = {"mislav", "stanko", "mislav", "ana"};
		String[] comp = {"stanko", "ana", "mislav"};
		System.out.println(s.solution(part, comp));
	}

}

class Solution6 {
    public String solution(String[] participant, String[] completion) {
    	ArrayList<String> list = new ArrayList<String>();
    	String answer = "";
    	for (String s : participant) {
			list.add(s);
		}
    	for (String s : completion) {
    		int f = Collections.frequency(list, s);
    		if(f!=1) {
    			answer = s;
    		}
		}
        return answer;
    }
}