package 제어문.반복문;

import java.util.Scanner;

public class 제어정리문제기본2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("사과 구매 갯수는? >> ");
		int apN = sc.nextInt();
		System.out.print("사과 가격은? >> ");
		int apP = sc.nextInt();
		System.out.print("딸기 구매 갯수는? >> ");
		int stN = sc.nextInt();
		System.out.print("딸기 가격은? >> ");
		int stP = sc.nextInt();

		int apTot = apN * apP;
		int stTot = stN * stP;
		int tot = apTot + stTot;

		System.out.println("사과 구매 가격은 " + apTot + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + stTot + "원 입니다.");
		System.out.println("전체 구매 가격은 " + tot + "원 입니다.");
	}
}
