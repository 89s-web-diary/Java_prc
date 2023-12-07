package 프로그래머스기초1일차;

import java.util.Arrays;

public class 조건수열변환1 {

	public static void main(String[] args) {
		
		Solution9 sol = new Solution9();
		int[] arr = {1, 2, 3, 100, 99, 98};
		System.out.println(Arrays.toString(sol.solution(arr)));
		
	}

}


class Solution9 {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i=0; i < arr.length; i++) {
			if(arr[i]>=50 && arr[i]%2==0) {
				answer[i] = arr[i]/2;
			}else if(arr[i]<50 && arr[i]%2==1) {
				answer[i] = arr[i]*2;
			}else {
				answer[i] = arr[i];
			}
		}
        return answer;
    }
}