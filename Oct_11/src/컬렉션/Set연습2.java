package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Set연습2 {

	public static void main(String[] args) {
		
		// Arraylist를 이용해서 만들기
		Random r = new Random();
		ArrayList lotto = new ArrayList();

		for (int i = 0; i < 6; i++) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto);
		
		// 중복된 값 또 발생
	}

}
