package 배열응용;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력 5개 받아서 --> 저장 --> 꺼내서 누적연산

		int[] jumsu = new int[5];
		int sum = 0;

		for (int i = 0; i < jumsu.length; i++) {
			String a = JOptionPane.showInputDialog("숫자 입력");
			jumsu[i] = Integer.parseInt(a);
			sum = sum + Integer.parseInt(a);
		}
		// 출력! --> 내용만 확인 가능
		System.out.println(Arrays.toString(jumsu));
		
		System.out.println("전체 합계 : " + sum);
		System.out.println("전체 평균 : " + (double)sum / jumsu.length);

	}

}
