package 컬렉션;

import java.util.HashSet;
import java.util.Random;

public class Set연습3 {

	public static void main(String[] args) {

		// HashSet 이용 시 중복되는 내용을 포함시키지 않음
		Random r = new Random();
		HashSet lot = new HashSet();

		while (lot.size() < 6) {
			lot.add(r.nextInt(45) + 1);
		}

		System.out.println(lot);

		// 성공띠
	}

}
