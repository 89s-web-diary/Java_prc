package 프로그래머스기초1일차;

import java.util.Scanner;

public class 문자열돌리기 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char c : a.toCharArray()) {
			System.out.println(c);
		}
        sc.close();
    }

}
