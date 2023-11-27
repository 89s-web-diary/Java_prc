package 비선형구조;

import java.util.ArrayList;
import java.util.Collections;

public class 중복된숫자갯수 {

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		int[] array = {1, 1, 2, 3, 4, 5};
		int n = 1;
		System.out.println(s.solution(array, n));
	}

}

// 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때
// array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요.

class Solution2 {
    public int solution(int[] array, int n) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	for (Integer i : array) {
			list.add(i);
		}
    	int answer = Collections.frequency(list, n);
        return answer;
    }
}