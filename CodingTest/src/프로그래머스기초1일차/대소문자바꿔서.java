package 프로그래머스기초1일차;

import java.util.Scanner;

public class 대소문자바꿔서 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String[] array = a.split("");
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(array[i].toUpperCase())) {
				ans.append(array[i].toLowerCase());
			} else {
				ans.append(array[i].toUpperCase());
			}
		}
		System.out.println(ans.toString());
		sc.close();
	}

}

// Charater.isUpperCase() / Charater.isLowerCase() >> Charater변수가 대문자인지 소문자인지 boolean값으로 반환해주는 method
