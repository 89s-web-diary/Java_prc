package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

import 배열기본.Print;

public class 문자열정렬하기 {

	public static void main(String[] args) {
		Solution1 s = new Solution1();
		String my_string = "hi12392";
		Print.arr(s.solution(my_string));
	}

}

// 문자열 my_string이 매개변수로 주어질 때,
//my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.

class Solution1 {
    public int[] solution(String my_string) {
    	char[] c = my_string.toCharArray();
    	ArrayList<Character> list = new ArrayList<Character>();
		for (char d : c) {
			if(d - '0' <= 9) {
				list.add(d);
			}
		}
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = Integer.parseInt(list.get(i).toString());
		}
        Arrays.sort(answer);
        return answer;
    }
}