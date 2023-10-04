package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 전화번호문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력 >> ");

		String a = sc.next();
		String b[] = a.split("-");

		System.out.println(Arrays.toString(b));

		if (b[0].equals("011")) {
			System.out.println("SK");
		} else if (b[0].equals("019")) {
			System.out.println("LG");
		} else {
			System.out.println("Apple");
		}
		
		if(b[1].length()>=4) {
			System.out.println("최신폰");
		}else {
			System.out.println("올드폰");
		}
		
		int len = 0;
		for (String string : b) {
			len += string.length();
		}
		System.out.println(len);
		if (len>=10) {
			System.out.println("유효한 전화번호");
		}else {
			System.out.println("유효하지 않은 전화번호");
		}
	}

}
