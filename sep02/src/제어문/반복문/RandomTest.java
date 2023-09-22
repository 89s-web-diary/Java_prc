package 제어문.반복문;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println(r.nextInt(100));	// nextInt() 괄호안의 값을 100으로 하면 0~99까지 나오게 함
											// 최댓값 설정해주는 기능
		
	}

}
