package 제어문.반복문;

import java.util.Scanner;

public class 제어정리문제심화2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("시작값 입력 >> ");
		int fir = sc.nextInt();
		System.out.print("종료값 입력 >> ");
		int lst = sc.nextInt();
		System.out.print("점프값 입력 >> ");
		int jmp = sc.nextInt();
		
		int sum = 0;

		for (int i = fir; i < lst + 1; i=i+jmp) {
			sum = sum + i;
			if(sum > 100) {
				System.exit(0);
			}
			System.out.println(sum);
		}
	}
}
