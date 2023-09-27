package 배열응용고급;

import java.util.Arrays;

public class 스트링활용부품 {

	public static void main(String[] args) {
	
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");
		// split을 이용하면 ,를 기준으로 추출
		System.out.println(Arrays.toString(s2));
		System.out.println(s2[1]);
		
		String s3 = "         홍길동";
		String s4 = s3.trim();	// trim을 이용하면 공백을 다 지워줌
		System.out.println(s4.length());
		
		String s5 = s3.replace("         ", "");	// trim 이랑 동일한데 trim이 편함
		System.out.println(s5);
		String s6 = "홍길동";
		
		char[] s7 = s6.toCharArray();	// String 인 s6를 index별로 쪼개서 char배열로 저장
		System.out.println(s7[0]);
		System.out.println(s7[1]);
		System.out.println(s7[2]);
		
		
		
	}

}
