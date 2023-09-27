package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 배열입력저장최소최대 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int[] jumsu  = new int[10];
		
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print("데이터 입력 >> ");
			jumsu[i] = sc.nextInt(); 
		}
		
		System.out.println(Arrays.toString(jumsu));
		Arrays.sort(jumsu);
		System.out.println("최댓값 >> "+jumsu[jumsu.length-1]);
		System.out.println("최솟값 >> "+jumsu[0]);
		
		
		
	}

}
