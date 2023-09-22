package 제어문.반복문;

import java.util.Scanner;

public class 제어정리문제기본1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ID 입력 >>> ");
		String id = sc.next();
		System.out.print("PW 입력 >>> ");
		String pw = sc.next();
		
		if(id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		}else {
			System.out.println("로그인 실패!");
		}
	}
}
