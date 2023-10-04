package 배열응용고급;

import java.util.Arrays;

public class 참조형복사 {

	public static void main(String[] args) {

		int[] n1 = { 100, 200, 300 };
		int[] n2 = n1; // 얕은 복사, 주소만 복사
		int[] n3 = n1.clone(); // 깊은 복사, 주소가 가르키는 값들의 목록을 복사

		System.out.println("n1의 주소 >> " + n1);
		System.out.println("n2의 주소 >> " + n2);
		System.out.println("n3의 주소 >> " + n3);

		n2[0] = 999;
		n3[0] = 111;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));

	}

}
