package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 가위바위보 {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int win = 0;

		while (true) {
			int com = r.nextInt(3);
			count++;
			System.out.print("가위:0  바위:1  보:2   종료:3  ");
			int my = sc.nextInt();
			if (my == 0) {
				System.out.print("나는 가위   ");
				if (com == 0) {
					System.out.println("컴퓨터는 가위");
					System.out.println("무승부입니다.");
				} else if (com == 1) {
					System.out.println("컴퓨터는 바위");
					System.out.println("당신이 졌습니다.");
				} else {
					System.out.println("컴퓨터는 보");
					System.out.println("당신이 이겼습니다.");
					win++;
				}
			} else if (my == 1) {
				System.out.print("나는 바위   ");
				if (com == 0) {
					System.out.println("컴퓨터는 가위");
					System.out.println("당신이 이겼습니다.");
					win++;
				} else if (com == 1) {
					System.out.println("컴퓨터는 바위");
					System.out.println("무승부입니다.");
				} else {
					System.out.println("컴퓨터는 보");
					System.out.println("당신이 졌습니다.");
				}
			} else if (my == 2) {
				System.out.print("나는 보   ");
				if (com == 0) {
					System.out.println("컴퓨터는 가위");
					System.out.println("당신이 졌습니다.");
				} else if (com == 1) {
					System.out.println("컴퓨터는 바위");
					System.out.println("당신이 이겼습니다.");
					win++;
				} else {
					System.out.println("컴퓨터는 보");
					System.out.println("무승부입니다.");
				}
			} else if (my == 3) {
				System.out.println("게임을 종료합니다");
				System.out.println("총 게임횟수 >>> " + count);
				System.out.println("당신이 이긴 횟수 >>> " + win);
				System.exit(0);
			} else {
				System.out.println("잘못입력했습니다 게임을 종료합니다");
				System.exit(0);
			}
		}

	}

}
