package 컬렉션;

import java.util.Arrays;
import java.util.Random;

public class Set연습1 {

	public static void main(String[] args) {
		
		// 배열을 이용해 로또번호 뽑기
		Random r = new Random();
		int[] lotto = new int[6];

		for (int i = 0; i < 6; i++) {
			lotto[i] = r.nextInt(45)+1;
		}
		System.out.println(Arrays.toString(lotto));
		
		// 로또 번호가 중복된게 들어갈 수 있음
	}

}
