package 제어문.반복문;

import java.util.Scanner;

public class 제어정리문제심화1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("시작값 입력 >> ");
		int fir = sc.nextInt();
		System.out.print("종료값 입력 >> ");
		int lst = sc.nextInt();
		int sum = 0;

		for (int i = fir; i < lst + 1; i++) {
			sum = sum + i;
			System.out.println(sum);
		}
		System.out.println("모두 더한 값은 " + sum + "입니다");
	}
}
