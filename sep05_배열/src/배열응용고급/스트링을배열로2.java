package 배열응용고급;

import java.util.Arrays;

public class 스트링을배열로2 {

	public static void main(String[] args) {
		
		String all = "국어, 영어, 수학, 컴퓨터";
		
		String[] a1 = all.split(",");
		System.out.println("1번"+Arrays.toString(a1));
		
		String[] a2 = all.split(", ");
		System.out.println("2번"+Arrays.toString(a2));
		
		System.out.println("과묵 수 >> "+a2.length);
		int n = 0, cnt = 0;
		for (int i = 0; i < a2.length; i++) {
			if(a2[i].equals("컴퓨터")) {
				System.out.println("컴퓨터의 위치 >> "+i);
			}
			if(a2[i].length() <3) {
				cnt++;
			}
		}
		
		
		System.out.println("과목명이 3글자 미만인 과목수 >> "+cnt);
	
	
	
	
	
	
	}

}
