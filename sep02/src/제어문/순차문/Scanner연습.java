package 제어문.순차문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Scanner연습 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 컨트롤 + 쉬프트 + M >>>> 임포트 필요한부분 자동으로 추가(부품 자동 추가)
		System.out.print("이름 입력 >> ");
		String a = sc.next();
		System.out.println("당신의 이름은 " + a);

//		sc.next(); <<<< 입력값을 String으로 받아옴
//		sc.nextInt(); <<<< 입력값을 Int로 받아옴
//		sc.netLine(); <<<< 띄어쓰기 포함 한줄 전체를 받아옴

		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		int age2 = age + 1;
		System.out.println("내년 당신의 나이는 " + age2);

		System.out.print("몸무게 입력 >> ");
		double weight = sc.nextDouble();
		System.out.println("당신의 몸무게는 >> " + weight + "kg");

		System.out.print("좌우명 입력 >> ");
		sc.nextLine();
		String lr = sc.nextLine();
		System.out.println("나의 좌우명은 " + lr + "입니다");
		

	}

}
