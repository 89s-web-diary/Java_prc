package 프로그래머스입문;

import java.util.Scanner;

public class 피자 {
	public static void main(String[] args) {
		Solution5 s5 = new Solution5();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(s5.solution(n));
		sc.close();
	}
}

class Solution5 {
    public int solution(int n) {
        if((n/7)>=1) {
        	if(n%7 == 0) return n/7;
        	else return n/7+1;
        }else return 1;
    }
}