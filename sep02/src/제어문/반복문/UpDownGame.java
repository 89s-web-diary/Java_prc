package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[] args) {

		Random rd = new Random();
		int rdv = rd.nextInt(99) + 1;
		int count = 0;
		int no = 0;

		while (true) {

			count++;
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력하세요  >>>  ");
			int what = sc.nextInt();

			if (what == rdv) {
				System.out.println("정답입니다 축하합니다!! 총 입력횟수 >> " + count);
				System.out.println("게임을 종료합니다");
				System.exit(0);
			} else {
				if (what > rdv) {
					System.out.println("정답이 아닙니다 숫자를 낮춰보세요");
					no++;
					System.out.println("틀린 횟수 = " + no);
				} else {
					System.out.println("정답이 아닙니다 숫자를 높여보세요");
					no++;
					System.out.println("틀린 횟수 = " + no);
				} // else
			} // else
		} // while
	} // main
} // class
