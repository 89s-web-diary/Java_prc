package 배열기본;

import java.util.Arrays;
import java.util.Random;

public class 랜덤값배열에넣기 {
	
	public static void main(String[] args) {
		
		//입력하는 객체 필요 Scanner
		//많은 양의 데이터를 선형으로 넣을 수 있는 객체
		//배열을 사용
		Random r = new Random();
		int[] numbers = new int[3];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i]=r.nextInt(100);
		}
		System.out.println(Arrays.toString(numbers));
		
	}

}