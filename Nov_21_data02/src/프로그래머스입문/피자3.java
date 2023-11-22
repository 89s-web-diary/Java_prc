package 프로그래머스입문;

import java.util.Scanner;

public class 피자3 {
	public static void main(String[] args) {
		Solution6 s5 = new Solution6();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(s5.solution(s, n));
		sc.close();
	}
}

class Solution6 {
    public int solution(int slice, int n) {
        return (n+slice-1)/slice;
    }
}