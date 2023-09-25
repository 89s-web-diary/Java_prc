package 배열문제;

import java.util.Arrays;
import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];

		for (int i = 0; i < n.length; i++) {
			System.out.print("숫자 입력 >> ");
			n[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(n));

		System.out.println(n[0] + " + " + n[2] + " = " + (n[0] + n[2]));
		
		String[] str = new String[3];
		for (int i = 0; i < str.length; i++) {
			str[i]= sc.next();
		}
		System.out.println(str[0] + " 보다는 "+ str[1]);
	}

}
