package 배열기본;

import java.util.Random;

public class 랜덤최솟값찾기 {
	public static void main(String[] args) {
		Random r = new Random(100);
		int[] n = new int[1000];
		for (int i = 0; i < n.length; i++) {
			n[i]=r.nextInt(1000);
		}
		int min = n[0];
		Print.arr(n);
		
		for (int i : n) {
			if(i<min) {
				min = i;
			}
		}
		System.out.println(min);
	}

}
