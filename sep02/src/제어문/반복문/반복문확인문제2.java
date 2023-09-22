package 제어문.반복문;

import java.util.Scanner;

public class 반복문확인문제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nb1 = 0;
		int nb2 = 0;

		while (true) {
			System.out.print("숫자입력1 >> ");
			int n1 = sc.nextInt(); // 첫번째 숫자 n1에 저장
			System.out.print("숫자입력2 >> ");
			int n2 = sc.nextInt(); // 두번째 숫자 n2에 저장
			if (n1 == n2) { // 두 수 비교
				System.out.print("같은 숫자입니다");
			} else {
				if (n1 > n2) {
					nb1++;
					System.out.print("앞 숫자가 더 큽니다.");
				} else {
					nb2++;
					System.out.print("뒷 숫자가 더 큽니다.");
				}
			}

			System.out.print(" 더 하시겠습니까? 종료(x) >>>  ");	 // 계속하기 묻기
			String repeat = sc.next();

			if (repeat.equals("x") || repeat.equals("X")) {	 // 계속하기 대답
				System.out.println("게임을 종료합니다.!!");
				System.out.println("앞이 큰 경우는 " + nb1 + "회");
				System.out.println("뒤가 큰 경우는 " + nb2 + "회");
				System.exit(0);
			}
		}
	}
}
