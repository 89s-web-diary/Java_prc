package 제어문.조건문;

import java.util.Scanner;

public class SwitchTest1 {

	public static void main(String[] args) {
		
		System.out.print("어떤 언어를 사용하시나요? >>> ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		// 데이터타입 : long 사용 불가, 실수불가능!
		// 			char ,String, int 사용가능
		switch (name) {
		case "자바":
			System.out.println("1101호로 go!");
			break;
		case "파이썬":
			System.out.println("1102호로 go!");
			break;
		case "리눅스":
			System.out.println("1103호로 go!");
			break;
		default:
			System.out.println("카운터로 go!");
			break;
		}
		
	}

}
